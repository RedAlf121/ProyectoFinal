package Posta.Logic.persons;

import java.util.ArrayList;
import java.util.Date;

import enums.Genre;
import enums.StatesWorker;

public class Worker extends Person{
    private Date comebackDate;

    private ArrayList<Date> listOfVacationDays;
    protected StatesWorker actualState;



    public Worker(String id, String name, Genre sex, StatesWorker newState, Date comebackDate) {
        super(id, name, sex);
        setActualState(newState);
        setComebackDate(comebackDate);
        listOfVacationDays = new ArrayList<>();
    }

    public Date getComebackDate() {
        return comebackDate;
    }

    public void setComebackDate(Date comebackDate) {
        if(actualState == StatesWorker.AWARE)
            this.comebackDate = comebackDate;
        else
            this.comebackDate = null;
    }

    public void setListOfVacationDays(ArrayList<Date> listOfVacationDays) {
        
        if(listOfVacationDays.size() == 0)
            throw new IllegalArgumentException("Este listado está vacío");

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
    public void setActualState(StatesWorker newState)
    {
        //TODO
    }

    public StatesWorker getActualState()
    {
        //TODO
        return null;
    }

}
