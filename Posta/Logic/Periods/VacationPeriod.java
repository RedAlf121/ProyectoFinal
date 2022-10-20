package Posta.Logic.Periods;

import java.util.ArrayList;
import java.util.Date;

import Posta.Logic.persons.Person;

public class VacationPeriod extends PlanningPeriod{

    public VacationPeriod(Date start, Date end, ArrayList<Person> persons) {
        super(start, end, persons);
        
    }

    @Override
    public void organize(Date start, Date end) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void split(ArrayList<Person> persons) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fullOrganize() {
        // TODO Auto-generated method stub
        
    }
    
}
