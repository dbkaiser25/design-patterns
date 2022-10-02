package singleton;

/**
 * A class that defines a clothing item 
 * @author dbkaiser
 */
import java.util.ArrayList;

public class ClothingItem 
{
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons;

    /**
     * Creates an instance of the class with a name, clothing part, and color
     * @param name A string for the name of the clothing item
     * @param part A Clothing part for the part of the item
     * @param color A string for the color of the item
     */
    public ClothingItem(String name, ClothingPart part, String color)
    {
        this.name = name;
        this.part = part;
        this.color = color;
        seasons = new ArrayList();
    }

    /**
     * Determines if the provided season is suitable for this clothing item
     * @param season the user provided season to be compared if suitable for
     * @return a boolean if the season is suitable
     */
    public boolean hasSeason(Season season)
    {
        for(Season s: seasons)
        {
            if(s == season)
                return true;
        }
        return false;
    }

    /**
     * A method to add a season to this item's list of suitable seasons
     * @param season the season to be added
     */
    public void addSeason(Season season)
    {
        seasons.add(season);
    }

    /**
     * A method to return a string represenation of the Clothing Item
     * @return A string of the item
     */
    public String toString()
    {
        return "" + color + " " + name;
    }
    
}
