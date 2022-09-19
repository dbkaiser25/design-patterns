package factory;

public class GroceryStore 
{
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
