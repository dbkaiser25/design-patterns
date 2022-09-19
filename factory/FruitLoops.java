package factory;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitLoops extends Cereal 
{
    public FruitLoops()
    {
        super("Fruit Loops",1.89,new ArrayList<String>(Arrays.asList(new String[] 
        {"Paw Patrol Stickers","Bat Man ring","Silly Putty","Tiny Car"}))); 
    }

    public String prepare()
    {
        return super.prepare() + "\t" + "- Shape into circles\n\t" + "- Randomly color circles\n\t" + "- Let circles dry\n";
    }
}

