package Posta.Logic.watch;

public class Turn{
    private String schedule;
    private boolean done;

    public Turn(String schedule){
        this.schedule = schedule;
    }

    public void setDone(boolean done){
        this.done = done;
    }

    public boolean isDone(){
        return this.done;
    }
}