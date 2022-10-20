package Posta.Logic.Periods;

import java.util.ArrayList;
import java.util.Date;

import Posta.Logic.Persons.Person;

public class VacationPeriod extends PlanningPeriod{

    public VacationPeriod(Date start, Date end, ArrayList<Person> persons) {
        super(start, end, persons);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void organize() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void split(ArrayList<Person> persons) {
        // TODO Auto-generated method stub
        
    }
    
}
