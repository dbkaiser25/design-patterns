package observer;

/**
 * describes an observer that will watch over the subject and respond when notified
 * @author dbkaiser
 */

import java.util.Random;

public class Dad implements Observer
{

    private Subject baby;
    private Random rand = new Random();

    /**
     * Creates a new Dad observer to watch over a specific baby
     * @param baby The name of the baby subject to be watched over
     */
    Dad(Subject baby)
    {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * Describes how the Dad observer will respond when there is a change in the subject
     * @param cry The type of Cry that is being reported from the baby subject
     */
    public void update(Cry cry)
    {
        int x = rand.nextInt(3);

        if(x == 0)
        {
            //"Dad puts a pillow over his head"
            System.out.println("Dad puts a pillow over his head");
        }
        else if (x == 1)
        {
            //"Dad nudges mom"
            System.out.println("Dad screams .... aaaaa");
        }
        else
        {
            //"Dad screams .... aaaaa"
            System.out.println("Dad nudges mom");
        }
    }
}
