package observer;

/**
 * A baby needs to be monitered 
 * @author dbkaiser 
 * 
 */

import java.util.ArrayList;
import java.util.Random;

public class Baby implements Subject
{
  private String name;

  /**
   * An ArrayList that stores the names of objects that observe the subject
  */
  private ArrayList<Observer> observers = new ArrayList();
  private Random rand = new Random();
  
  /**
   * Creates a new baby with the indicated name
   * @param name The name of the baby
   */
  Baby(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  /**
   * Describes how the baby reacts based on responses from the observers
   */
  public void recieveLove()
  {
    int x = rand.nextInt(2);

    if(x == 0)
    {
        System.out.println(getName() + " feels appreciated and loved.");
    }
    else
        System.out.println(getName() + " pushes everyone away and continues to cry.");
  }

  /**
   * Specifies how the baby reacts to being fed by the observers
   */
  public void eat()
  {
    int x = rand.nextInt(2);

    if(x == 0)
    {
        System.out.println(getName() + " has a happy full tummy.");
    }
    else
        System.out.println(getName() + " throws all his food on the floor.");
  }

  /**
   * How the baby reacts to being changed from the observers
   */
  public void getChanged()
  {
    System.out.println(getName() + " is having a diaper change.");
  }

  /**
   * Adds an observer to the list of objects watching the subject
   * @param observer The name of the observer object that will be watching the subject
   */
  public void registerObserver(Observer observer)
  {
    observers.add(observer);
  }

  /**
   * Removes an observer from the list
   * @param observer The name of the observer to be removed from the lsit
   */
  public void removeObserver(Observer observer)
  {
    observers.remove(observer);
  }

  /**
   * Notifies the observers there has been a change in the subject
   * @param cry The name of the cry coming from the baby
   */
  public void notifyObservers(Cry cry)
  {
    for(Observer o: observers)
    {
        o.update(cry);
    }       
  }

  /**
   * A cry behavior of the baby to be reported to the observers
   */
  public void angryCry()
  {
    System.out.println("Waaaaaaaaaa! " + getName() + " is feeling abandoned and angry.");
    notifyObservers(Cry.ANGRY);
  }

  public void hungryCry()
  {
    System.out.println("Neh Neh Neh! " + getName() + " is starving!!!!");
    notifyObservers(Cry.HUNGRY);
  }

  public void wetCry()
  {
    System.out.println("Aaaaaaaa! " + getName() + " is WET!");
    notifyObservers(Cry.WET);
  }
}
