package singleton;

/**
 * A class to create outfits for the user
 * @author dbkaiser
 */
import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator 
{
    /**
     * Instance array lists that stores the different clothing items to be made into outfits
     */
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    private Random rand = new Random();
    private static OutfitCreator outfitCreator;

    /**
     * Creates an instance of the class that populates the array lists with the different clothing items
     */
    private OutfitCreator()
    {
        tops = FileReader.getClothing("singleton/tops.txt",ClothingPart.TOP);
        bottoms = FileReader.getClothing("singleton/bottoms.txt",ClothingPart.BOTTOM);
        wholes = FileReader.getClothing("singleton/wholes.txt",ClothingPart.WHOLE);
    }

    /**
     * A class to return an instance of the OutfitCreator so that its methods can be called and only created once
     * @return an instance of the class
     */
    public static OutfitCreator getInstance()
    {
        if(outfitCreator == null)
        {
            outfitCreator = new OutfitCreator();
        }
        return outfitCreator;
    }

    /**
     * Method that creates an outfit for the user 
     * @param season The user specifies what season their outfit must be suitable for 
     * @return A string representation of the outfit
     */
    public String getOutfit(Season season)
    {
        if(rand.nextBoolean())
        {
            for(ClothingItem cI: wholes)
            {   
                if(cI.hasSeason(season))
                {
                    return "A " + cI.toString();
                }
            }
            return null;
        }
        else
        {
            int size;
            ClothingItem top = null, bottom = null;
            boolean topFound = false, botFound = false;
            
            if(tops.size() < bottoms.size())
            {
                size = tops.size();
            }
            else
            {
                size = bottoms.size();
            }
            for(int i = 0; i < size; i++)
            {
                if((!topFound) && tops.get(i).hasSeason(season))
                {
                    top = tops.get(i);
                    topFound = true;
                }
                if((!botFound) && bottoms.get(i).hasSeason(season))
                {
                   bottom = bottoms.get(i);
                   botFound = true;
                }
            }
            return "A " + top.toString() + "and " + bottom.toString();
        }
    }
}
