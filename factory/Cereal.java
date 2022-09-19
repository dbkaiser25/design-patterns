package factory; 

import java.util.ArrayList;
import java.util.Random;

public abstract class Cereal 
{
    protected String name;
    protected double price;
    protected ArrayList<String> toys = new ArrayList();

    public Cereal(String name, double price, ArrayList<String> toys)
    {
        this.name = name;
        this.price = price;
        for(int i = 0; i < toys.size();i++)
        {
            //toys.add(this.toys.get(i));
            this.toys.add(toys.get(i));
        }
    }

    public String prepare()
    {

        return "Preparing the " + name + "\n\t- Gather the grain\n" + "";
    }

    public String boxCereal()
    {
        Random rand = new Random();  
        int randomNum = rand.nextInt(4);
        return "Boxing the " + name + "\n\t" + "- Drawing fun pictures of " + name + " on the box" 
        + "\n\t- Pouring the " + name + " into the box\n\t" + "- Adding the suprise " + toys.get(randomNum) + "\n";
    }

    public String priceCereal()
    {
        //String str = new String();
        //str = price;

        return "Putting the price tag of $" + price + " on the " + name + " box";
    }
}
