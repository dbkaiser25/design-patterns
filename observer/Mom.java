package observer;

/**
 * describes the mom observer that will watch over the subject and respond when notified
 * @authoer dbkaiser
 */

public class Mom implements Observer{

    private Subject baby;

    /**
     * Creates a new Mom observer to watch over a specific baby
     * @param baby The name of the baby subject to be watched over
     */
    Mom(Subject baby)
    {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * Describes how the Mom observer will respond when there is a change in the subject 
     * @param cry The type of Cry that is being reported fromt the baby subject
     */
    public void update(Cry cry)
    {
        if(cry == Cry.ANGRY)
        {
            System.out.println("Mom hugs " + ((Baby)baby).getName());
            ((Baby)baby).recieveLove();
        }
        else if (cry == Cry.HUNGRY)
        {
            System.out.println("Mom feeds " + ((Baby)baby).getName());
            ((Baby)baby).eat();
        }
        else if (cry == Cry.WET)
        {
            System.out.println("Mom changes " + ((Baby)baby).getName());
            ((Baby)baby).getChanged();
        }
    }
    
}
