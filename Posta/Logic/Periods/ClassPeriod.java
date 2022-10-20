public class ClassPeriod extends PlanningPeriod{
    private ArrayList<Student> students;
    private ArrayList<Worker> workers;

    private ArrayList<Student> absent;

    public ClassPeriod(Date start, Date end, ArrayList<Person> personList){
        this.students = new ArrayList<>();
        this.workers = new ArrayList<>();

        splitList(personList);
        organize(start, end);

    }
    
    //Splitea la lista completa de personas en trabajadores y estudiantes
    public splitList(ArrayList<Perosn> personList){
        if(personList.size() == 0)
            throw new IllegalArgumentException("Lista vacía, no se puede planificar guardia sin personal");
        
        for(Person p: personList){
            if(p instanceof Student)
                students.add(p);
            else
                workers.add(p);
        }
    }

    public boolean canMatch(Person person, Date date){
        return false;
    }

    public void organize(){
        ;
    }

    public int countAbsent(){
        return absent.size();

    }

}