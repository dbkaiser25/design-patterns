package factory;

/**
 * Defines a new brand of cereal
 * @author dbkaiser
 */

import java.util.ArrayList;
import java.util.Arrays;

public class LuckyCharms extends Cereal
{
    /**
     * Creates a new Lucky Chamrs brand of cereal
     */
    public LuckyCharms()
    {
        super("Lucky Charms",1.55,new ArrayList<String>(Arrays.asList(new String[] 
        {"My Little Pony Stickers","Else ring","Play doe","Tiny truck"}))); 
    }

    /**
     * A cereal brand is being assembled
     * @return A string of the cereal brand is being prepared
     */
    public String prepare()
    {
        return super.prepare() + "\t" + "- Shape into Xs and Os\n\t" + "- Create marshmallow shapes\n\t" + "- Mix grain and marshamllows\n";
    }
}
