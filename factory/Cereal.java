package factory; 

/**
 * A class for cereal
 * @author dbkaiser
 */

import java.util.ArrayList;
import java.util.Random;

public abstract class Cereal 
{
    protected String name;
    protected double price;

    /**
     * An ArrayList that stores the different options for the surprise toy
     * @param toys the name of the ArrayList
     */
    protected ArrayList<String> toys = new ArrayList();

    /**
     * Creates a new cereal type with the following attributes
     * @param name The brand of cereal
     * @param price The decimal value of the price
     * @param toys The name of ArrayList that stores different options for teh surprise toy
     */
    public Cereal(String name, double price, ArrayList<String> toys)
    {
        this.name = name;
        this.price = price;
        for(int i = 0; i < toys.size();i++)
        {
            this.toys.add(toys.get(i));
        }
    }

    /**
     * A cereal type is being assembled
     * @return A string of the cereal being prepared
     */
    public String prepare()
    {
        return "Preparing the " + name + "\n\t- Gather the grain\n" + "";
    }

    /**
     * A cereal type is being packaged 
     * @return A string of the cereal being boxxed
     */
    public String boxCereal()
    {
        Random rand = new Random();  
        int randomNum = rand.nextInt(4);
        return "Boxing the " + name + "\n\t" + "- Drawing fun pictures of " + name + " on the box" 
        + "\n\t- Pouring the " + name + " into the box\n\t" + "- Adding the suprise " + toys.get(randomNum) + "\n";
    }

    /**
     * All cereals have a price 
     * @return A string of the price 
     */
    public String priceCereal()
    {
        return "Putting the price tag of $" + price + " on the " + name + " box";
    }
}
