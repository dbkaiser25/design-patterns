package factory;

/**
 * Defines a new brand of cereal
 * @author dbkaiser
 */
import java.util.ArrayList;
import java.util.Arrays;

public class FruitLoops extends Cereal 
{
    /**
     * Creates a new Fruit Loops brand of cereal
     */
    public FruitLoops()
    {
        super("Fruit Loops",1.89,new ArrayList<String>(Arrays.asList(new String[] 
        {"Paw Patrol Stickers","Bat Man ring","Silly Putty","Tiny Car"}))); 
    }

    /**
     * A cereal brand is being assembled
     * @return A string of the cereal bran being prepared
     */
    public String prepare()
    {
        return super.prepare() + "\t" + "- Shape into circles\n\t" + "- Randomly color circles\n\t" + "- Let circles dry\n";
    }
}

