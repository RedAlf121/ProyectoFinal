<<<<<<< Updated upstream
package Posta.Logic.Periods;

import java.util.ArrayList;
import java.util.Date;

import Posta.Logic.persons.Person;
import Posta.Logic.persons.Student;
import Posta.Logic.persons.Worker;
=======
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
>>>>>>> Stashed changes

public class ClassPeriod extends PlanningPeriod{
    private ArrayList<Student> students;
    private ArrayList<Worker> workers;

    private ArrayList<Student> absent;

    public ClassPeriod(Date start, Date end, ArrayList<Person> personList){
<<<<<<< Updated upstream
        super(start, end, personList);
=======
    	super(start, end, personList);
>>>>>>> Stashed changes
        this.students = new ArrayList<>();
        this.workers = new ArrayList<>();

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
<<<<<<< Updated upstream
    @Override
    public void split(ArrayList<Person> personList) {
=======
    public void split(ArrayList<Person> personList){
>>>>>>> Stashed changes
        if(personList.size() == 0)
            throw new IllegalArgumentException("Lista vacía, no se puede planificar guardia sin personal");
        
        for(Person p: personList){
            if(p instanceof Student)
<<<<<<< Updated upstream
                students.add((Student) p);
            else
                workers.add((Worker) p);
        }
    }


    @Override
    public void organize(Date start, Date end) {
        // TODO Auto-generated method stub
        
=======
                students.add((Student)p);
            else
                workers.add((Worker)p);
        }
    }

    public boolean canMatch(Person person, Date date){
        return false;
    }
    
    public void match(Person person, Date date){
    	;
    }
    
    public void organize(Date start, Date end){
        if(start.compareTo(end) > 0)
        	throw new IllegalArgumentException("Fecha de inicio y fin no v�lidas, la de fin debe ser despu�s de la de inicio");
        Person aux;
        int s = 0;
        int w = 0;
        
        while(start.compareTo(end) < 0){
        	if(canMatch(students.get(s), start)){
        		match(students.get(s), start);
        		aux = students.get(s);
        		students.remove(s);
        		students.add((Student)aux);
        		if(s > 0)
        			s--;
        	}
        	else{
        		s++;
        	}
        	if(isWeekend(start) && canMatch(workers.get(w), start)){
        		match(workers.get(w), start);
        		aux = students.get(s);
        		workers.remove(s);
        		workers.add((Worker)aux);
        		if(w > 0)
        			w--;
        	}
        	else
        		w++;
        }
>>>>>>> Stashed changes
    }


    @Override
    public void fullOrganize() {
        // TODO Auto-generated method stub
        
    }

}