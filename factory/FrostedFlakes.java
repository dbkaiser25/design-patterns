package factory;

/**
 * Defines a new brand of cereal 
 * @author dbkaiser
 */

import java.util.ArrayList;
import java.util.Arrays;

public class FrostedFlakes extends Cereal 
{
    /**
     * Creates a new Frosted Flake brand of cereal 
     */
    public FrostedFlakes()
    {
        super("Frosted Flakes",2.99,new ArrayList<String>(Arrays.asList(new String[] 
        {"Spider man Tattoo","Barbie Tattoo","Snap Bracelet","Happy Feet Figurine"}))); 
    }

    /**
     * A cereal brand is being assembled 
     * @return A string of the cereal brand being prepared
     */
    public String prepare()
    {
        return super.prepare() + "\t- Shape into flakes\n\t" + "- Sprinkle with frosting\n";
    }
}
