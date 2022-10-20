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
        ;
    }

    public ArrayList<Workers> listOfForeignerWorkers(){
        ;
    }

    public ArrayList<Date> getListOfWatchDays(Person person){
        ;
    }

    public void addStudent(String id, String name, Genre sex, StatesStudent state){
        ;
    }

    public void addWorker(String id, String name, Genre sex, StatesWorker state, Date day){
        ;
    }
}