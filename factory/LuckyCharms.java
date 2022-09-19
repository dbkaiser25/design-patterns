package factory;

import java.util.ArrayList;
import java.util.Arrays;

public class LuckyCharms extends Cereal
{
    public LuckyCharms()
    {
        super("Lucky Charms",1.55,new ArrayList<String>(Arrays.asList(new String[] 
        {"My Little Pony Stickers","Else ring","Play doe","Tiny truck"}))); 
    }

    public String prepare()
    {
        return super.prepare() + "\t" + "- Shape into Xs and Os\n\t" + "- Create marshmallow shapes\n\t" + "- Mix grain and marshamllows\n";
    }
}
