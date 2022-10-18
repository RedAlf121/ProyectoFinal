package Posta.Logic.Persons;

import java.util.ArrayList;
import java.util.Date;

import Posta.Logic.Persons.Enums.Genre;
import Posta.Logic.Persons.Enums.States;

public class Worker extends Person{
    private Date comebackDate;

    private ArrayList<Date> listOfVacationDays;



    public Worker(String id, String name, Genre sex, States newState, Date comebackDate) {
        super(id, name, sex, newState);
        setComebackDate(comebackDate);
        listOfVacationDays = new ArrayList<>();
    }

    public Date getComebackDate() {
        return comebackDate;
    }

    public void setComebackDate(Date comebackDate) {
        if(actualState == States.AWARE)
            this.comebackDate = comebackDate;
        else
            this.comebackDate = null;
    }

    public void setListOfVacationDays(ArrayList<Date> listOfVacationDays) {
        for(Date i : listOfVacationDays)
        {
            if(i == null)
                throw new IllegalArgumentException("Este listado contiene fechas nulas");
        }
        this.listOfVacationDays = listOfVacationDays;
    }

    public boolean doVacationWatch()
    {
        return listOfVacationDays.size()!=0;
    }

    public void addDay(Date newDay)
    {
        if(newDay == null)
            throw new IllegalArgumentException("Error fecha vacia");
        listOfVacationDays.add(newDay);
    }

    public void updateDay(Date oldDay, Date newDay)
    {
        if(oldDay == null)
            throw new IllegalArgumentException("La fecha antigua es vacia");
        if(newDay == null)
            throw new IllegalArgumentException("La nueva fecha es vacia");
        int indexOldDay = listOfVacationDays.indexOf(oldDay);
        listOfVacationDays.set(indexOldDay, newDay);
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
