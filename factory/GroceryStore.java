package factory;

/**
 * Defines a Grocery Store class that creates cereal brand objects
 * @author dbkaiser
 */
public class GroceryStore 
{
    /**
     * Creates a cereal brand object based off the name 
     * @param type the type of brand to be created
     * @return a cereal object of the given type
     */
    public Cereal createCereal(String type)
    {
        if(type == null)
        {
            return null;
        }
        if(type.equals("frosted flakes"))
        {
            return new FrostedFlakes();
        }
        else if(type.equals("fruit loops"))
        {
            return new FruitLoops();
        }
        else if(type.equals("lucky charms"))
        {
            return new LuckyCharms();
        }

        return null;
    }
}
