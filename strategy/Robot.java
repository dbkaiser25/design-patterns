package strategy;
import java.util.ArrayList;

abstract class Robot {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;


    Robot(String name)
    {
        this.name = name;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior)
    {
        //TODO
        System.out.println("setMove has been called in robot");
    }

    public void move()
    {
        System.out.println("move method in Robot has been called");
        System.out.println(moveBehavior);
        
        setMoveBehavior(moveBehavior);
        
    }

    public abstract String toString();

    public String getName()
    {
        return name;
    }

}

