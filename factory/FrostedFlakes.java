package factory;

import java.util.ArrayList;
import java.util.Arrays;

public class FrostedFlakes extends Cereal 
{
    public FrostedFlakes()
    {
        super("Frosted Flakes",2.99,new ArrayList<String>(Arrays.asList(new String[] 
        {"Spider man Tattoo","Barbie Tattoo","Snap Bracelet","Happy Feet Figurine"}))); 
    }

    public String prepare()
    {
        return super.prepare() + "\t- Shape into flakes\n\t" + "- Sprinkle with frosting\n";
    }
}
