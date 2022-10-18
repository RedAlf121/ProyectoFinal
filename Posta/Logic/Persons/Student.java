package Posta.Logic.Persons;

import Posta.Logic.Persons.Enums.Genre;
import Posta.Logic.Persons.Enums.States;

public class Student extends Person{

    protected States actualState;

    public Student(String id, String name, Genre sex, StatesStudent newState) {
        super(id, name, sex, newState);
    }

    public void setActualState(StatesWorker newState)
    {
        //TODO
    }

    public States getActualState()
    {
        //TODO
        return null;
    }
    
}
