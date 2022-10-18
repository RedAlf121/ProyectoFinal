package Posta.Logic.Persons;

import Posta.Logic.Persons.Enums.Genre;
import Posta.Logic.Persons.Enums.States;

public class Student extends Person{

    public Student(String id, String name, Genre sex, States newState) {
        super(id, name, sex, newState);
    }

    public void setActualState(States newState)
    {
        //TODO
    }

    public States getActualState()
    {
        //TODO
        return null;
    }
    
}
