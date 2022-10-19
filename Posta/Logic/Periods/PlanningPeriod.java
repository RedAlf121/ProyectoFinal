package Posta.Logic.Periods;

import java.util.ArrayList;
import java.util.Date;

import Posta.Logic.Persons.Person;

import Posta.Logic.Watch.Asignment;

public abstract class PlanningPeriod {

    protected Date start;
    protected Date end;
    
    private ArrayList<Asignment> asignments;
    private ArrayList<Person> persons;

    public PlanningPeriod(Date start, Date end, ArrayList<Person> persons)
    {
        
    }
    //Los metodos que dicen match se encargan de asignar una guardia a una persona, revisa que no hay colisiones    
    public boolean canMatch(Person person, Date date)
    {
        return false;
    }

    public void match(Person actualPerson, Date actualDate)
    {

    }

    public abstract void organize();
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        if(start == null)
            throw new IllegalArgumentException("Fecha vacia");
        
    }
    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
    public ArrayList<Asignment> getAsignments() {
        return asignments;
    }
    public void setAsignments(ArrayList<Asignment> asignments) {
        this.asignments = asignments;
    }
    public ArrayList<Person> getPersons() {
        return persons;
    }
    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    
}
