public class Holidays{
    private ArrayList<Date> daysList;

    public Holidays(){
        this.daysList = new ArrayList<>();
    }

    public boolean isHoliday(Date day){
        boolean check = false;
        if(daysList.indexOf(day) != -1)
            check = true;

        return check;
    }

    public void addDay(Date day){
        if(isHoliday(day))
            throw new IllegalArgumentException("Ya se encuentra registrado como día festivo");
        
        this.daysList.add(day);
    }

    public void removeDay(Date day){
        if(!isHoliday(day))
            throw new IllegalArgumentException("No se encuentra registrado como día festivo, no se puede eliminar");
        
        daysList.remove(day);
    }
}