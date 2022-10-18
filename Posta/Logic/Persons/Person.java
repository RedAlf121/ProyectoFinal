package Posta.Logic.Persons;

import java.util.Date;

import Posta.Logic.Persons.Enums.Genre;
import Posta.Logic.Persons.Enums.States;

public class Person {
    protected String id;
    protected String name;
    protected Genre sex; 

    public Person(String id, String name, Genre sex, States newState){
        setName(name);
        setSex(sex);
        setActualState(newState);
        setId(id);
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        
        if(id.length()!=11)throw new IllegalArgumentException("Error en cuanto al tamño del ID");

        else
        {
            final int MINIMUM_AGE = 15;
            final int MAXIMUM_AGE = 100;
            boolean numberOFLegalChars=true;
            //Se verifica que todos son numeros
            for(int i = 0; i < id.length() && numberOFLegalChars; i++)            
                numberOFLegalChars = (Character.isDigit(id.charAt(i)));
            
            if(!numberOFLegalChars)throw new IllegalArgumentException("Hay una letra en los id");
    
            else
            {
                //Buscando el error en la fecha
    
                //Los dias
                int auxiliarDay = 0;
                auxiliarDay = 10*(id.charAt(4)-'0') + (id.charAt(5)-'0'); //Tomamos los caracteres que corresponden al dia
    
                //Los meses
                int auxiliarMonth = 10*(id.charAt(2)-'0') + (id.charAt(3)-'0');//Tomamos los caracteres que corresponden al mes
    
                if(auxiliarMonth < 1 || auxiliarMonth > 12)
                    throw new IllegalArgumentException("Ese mes no existe");
                
                //Todas estas condiciones son para los dias y los meses.
                //Se usan variables booleanas para acortar el tamaño del if
                boolean januaryToJuly = (auxiliarMonth>=1 && auxiliarMonth <= 7); //si esta entre enero y julio
                boolean february = (auxiliarMonth == 2); //si es el mes de febrero
                boolean augustToDecember = (auxiliarMonth>=8 && auxiliarMonth <= 12); //si esta entre agosto y diciembre
                boolean even = auxiliarMonth%2==0; //Verifica si es par
                boolean haveTwentyEightDays = (auxiliarDay < 1 || auxiliarDay > 28); //se verifica si no esta entre los 28 dias de febrero
                boolean haveThirtyDays = (auxiliarDay < 1 || auxiliarDay > 30); //se verifica si no esta entre los 30 dias
                boolean haveThirtyOneDays = (auxiliarDay < 1 || auxiliarDay > 31);//se verifica si no esta entre los 31 dias
    
    
                /*
                 Los meses impares de enero a julio tienen 31 dias el resto 30 dias
                 Y los meses pares de agosto a diciembre tienen 31 dias y el resto 30 dias igual
                */
    
                if( (januaryToJuly && even && haveThirtyDays) || (januaryToJuly && !even && haveThirtyOneDays) || (february && haveTwentyEightDays) || (augustToDecember && even && haveThirtyOneDays) || (augustToDecember && !even && haveThirtyDays))
                    throw new IllegalArgumentException("Error de fecha");
    
                //Buscando error en el año
                Date actualDate = new Date();
                int year = 10*(id.charAt(0)-'0') + (id.charAt(1)-'0');//Obtengo los primeros digitos del ID
                int actually = actualDate.getYear();
                year+= (actually - actually%100);
    
                if(year>actually)year-=100;
    
                int age = actually - year;
                if(age < MINIMUM_AGE || age > MAXIMUM_AGE)
                    throw new IllegalArgumentException("Error en la edad");
    
                else
                {
                    //TODO TOCHECK
                    //Este compararia si ya se guardo previamente
                    //Los ultimos digitos no tienen porque ser unicos, asi se tienen mas opciones de IDs diferentes
                    
                }
                int genre = id.charAt(10)-'0';
                if((genre%2 == 0 && sex == Genre.FEMALE) || (genre%2 == 1 && sex == Genre.MALE)) 
                    throw new IllegalArgumentException("Error sexo no compatible con el id");                
            }
            this.id = id;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals(""))
            throw new IllegalArgumentException("Nombre vacio");
        this.name = name;
    }

    public Genre getSex() {
        return sex;
    }

    protected void setSex(Genre sex) {
        this.sex = sex;
    }

    public States getActualState() {
        return actualState;
    }

    public void setActualState(States actualState) {
        this.actualState = actualState;
    }

    


}
