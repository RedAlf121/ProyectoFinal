package Posta.Logic.persons;

import enums.Genre;
import enums.StatesStudent;

public class Student extends Person{

    protected StatesStudent actualState;

    public Student(String id, String name, Genre sex, StatesStudent newState) {
        super(id, name, sex);
        setActualState(newState);
    }

    public void setActualState(StatesStudent newState)
    {
        //TODO
    }

    public StatesStudent getActualState()
    {
        //TODO
        return null;
    }
    
}
