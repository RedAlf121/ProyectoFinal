package Posta.Logic.Periods;

import java.util.ArrayList;
import java.util.Date;

import Posta.Logic.persons.Person;
import Posta.Logic.persons.Student;
import Posta.Logic.persons.Worker;
import enums.Genre;

public class ClassPeriod extends PlanningPeriod{
    private ArrayList<Student> maleStudents;
    //Pense trabajar a las estudiantes por separado igual como a los profesores, me parece mas facil
    private ArrayList<Student> femaleStudents;
    //Esto es para saber a quienes les toca hacer la guardia en fin de semana, si a estudiantes o a trabajadors
    private boolean lastPersonWorker;
    private ArrayList<Worker> workers;
    private ArrayList<Student> absent;

    public ClassPeriod(Date start, Date end, ArrayList<Person> personList){
        super(start, end, personList);
        this.maleStudents = new ArrayList<>();
        this.femaleStudents = new ArrayList<>();
        this.workers = new ArrayList<>();

        this.lastPersonWorker = false;

        split(personList);
        organize(start, end);

    }
    
    
    public boolean canMatch(Person person, Date date){
        return false;
    }

    public int countAbsent(){
        return absent.size();

    }

    //Splitea la lista completa de personas en trabajadores y estudiantes

    public void split(ArrayList<Person> personList){
        if(personList.size() == 0)
            throw new IllegalArgumentException("Lista vacía, no se puede planificar guardia sin personal");
        
        for(Person p: personList){
            if(p instanceof Student){
                if(p.getSex() == Genre.MALE)
                    maleStudents.add((Student) p);
                else
                    femaleStudents.add((Student) p);
            }
            else
                workers.add((Worker) p);
        }
    }



    
    public void match(Person person, Date date){
    	;
    }
    
    public void organize(Date start, Date end){
        if(start.compareTo(end) > 0)
        	throw new IllegalArgumentException("Fecha de inicio y fin no v�lidas, la de fin debe ser despu�s de la de inicio");
        Person aux;
        int mS = 0;
        int fS = 0;
        int w = 0;
        
        while(start.compareTo(end) < 0){
        	if(canMatch(maleStudents.get(mS), start)){
        		match(maleStudents.get(mS), start);
        		aux = maleStudents.get(mS);
        		maleStudents.remove(mS);
        		maleStudents.add((Student)aux);
        		if(mS > 0)
                    mS--;
                if(isWeekend(start)){
                    if(!lastPersonWorker){
                        match(workers.get(w), start);
                        if(w == workers.size())
                            lastPersonWorker = true;
                        else
                            w++;
                    }
                    else{
                        match(femaleStudents.get(fS), start);
                        if(fS == femaleStudents.size()){
                            lastPersonWorker = false;
                        }
                        else
                            fS++;
                    }
                }
                start = new Date(start.getTime() + 86400000);
        	}
        	else{
                mS++;
        	}
        }
    }

    public void fullOrganize() {
        // TODO Auto-generated method stub
        
    }

}