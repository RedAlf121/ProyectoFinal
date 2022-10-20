package Posta.Logic.Periods;

import java.util.ArrayList;
import java.util.Date;

import Posta.Logic.persons.Person;
import Posta.Logic.persons.Student;
import Posta.Logic.persons.Worker;

public class ClassPeriod extends PlanningPeriod{
    private ArrayList<Student> students;
    private ArrayList<Worker> workers;

    private ArrayList<Student> absent;

    public ClassPeriod(Date start, Date end, ArrayList<Person> personList){
        super(start, end, personList);
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
    @Override
    public void split(ArrayList<Person> personList) {
        if(personList.size() == 0)
            throw new IllegalArgumentException("Lista vacía, no se puede planificar guardia sin personal");
        
        for(Person p: personList){
            if(p instanceof Student)
                students.add((Student) p);
            else
                workers.add((Worker) p);
        }
    }


    @Override
    public void organize(Date start, Date end) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void fullOrganize() {
        // TODO Auto-generated method stub
        
    }

}