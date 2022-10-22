package Posta.Logic.Periods;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

<<<<<<< Updated upstream
import Posta.Logic.persons.Person;
import Posta.Logic.watch.Asignment;

=======
>>>>>>> Stashed changes
public abstract class PlanningPeriod {

    protected Date start;
    protected Date end;
    
    protected ArrayList<Asignment> asignments;

    public PlanningPeriod(Date start, Date end, ArrayList<Person> persons)
    {
        setStart(start);
        setEnd(end);
        split(persons);
    }
    //Los metodos que dicen match se encargan de asignar una guardia a una persona, revisa que no hay colisiones    
    public boolean canMatch(Person person, Date date)
    {
        return false;
    }

    public void match(Person actualPerson, Date actualDate)
    {

    }

    public abstract void organize(Date start, Date end);
<<<<<<< Updated upstream
    public abstract void fullOrganize();
=======
>>>>>>> Stashed changes
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
    
    public abstract void split(ArrayList<Person> people);
    
    public static boolean isWeekend(Date day){
    	boolean check = false;
    	SimpleDateFormat df = new SimpleDateFormat( "dd/MM/yy" );  
        df.applyPattern( "EEE" ); 
        String date= df.format( day );
        if(date.equals("s�b") || date.equals("dom")) { 
            check = true;
        } 
    	
    	return check;
    }
}

