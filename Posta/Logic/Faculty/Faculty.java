import java.util.ArrayList;
import java.util.Date;

import Posta.Logic.Periods.PlanningPeriod;
import Posta.Logic.persons.Worker;
import Posta.Logic.persons.Person;
import enums.Genre;
import enums.StatesStudent;
import enums.StatesWorker;

public class Faculty{
    private String name;
    private ArrayList<Person> people;
    private ArrayList<PlanningPeriod> periods;

    public Faculty(String name){
        this.name = name;
        this.people = new ArrayList<>();
        this.periods = new ArrayList<>();
    }

    public void planninClassPeriod(Date start, Date end){
        ;
    }

    public void planningVacationPeriod(Date start, Date end){
        ;
    }

    public int countAbsent(){
        return 0;//TODO
    }

    public ArrayList<Worker> listOfForeignerWorkers(){
        return null;//TODO
    }

    public ArrayList<Date> getListOfWatchDays(Person person){
        return null;//TODO
    }

    public void addStudent(String id, String name, Genre sex, StatesStudent state){
        //TODO
    }

    public void addWorker(String id, String name, Genre sex, StatesWorker state, Date day){
        //TODO
    }
}