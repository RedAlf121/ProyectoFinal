package Posta.Logic.Watch;
import java.util.Date;

import Posta.Logic.Persons.Person;

public class Asignment{
    private Date day;

    private Turn turn;

    private Person personOnWantch;

    public Asignment(Person personOnWatch, Date day, String schedule){
        this.day = day;
        setPersonOnWatch(personOnWatch);
        setTurn(schedule);
    }

    public void setPersonOnWatch(Person personOnWatch){
        this.personOnWantch = personOnWantch;
    }

    private boolean validateSchedule(String schedule){
        boolean check = true;
        
        if(schedule == null || schedule.equals(""))
            check = false;
        
        return check;
    }
    
    public void setTurn(String schedule){
        if(!validateSchedule)
            throw new IllegalArgumentException("Horario no válido");
        
        this.turn = new Turn(schedule);
    }
    

}