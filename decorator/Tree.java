package decorator;

import java.util.ArrayList;

/**
 * A class that defines how a tree will look
 * @author dbkaiser
 */
public class Tree 
{
    protected ArrayList<String> lines = new ArrayList();

    /**
     * An array list that contains the design of the tree
     * @param lines the name of the array list
     */
    Tree(ArrayList<String> lines)
    {
        
        this.lines = lines;
    }

    /**
     * method to return a string representation of the tree 
     * @return a string representation of the tree
     */
    public String toString()
    {
        String s = new String();
        for(int i = 0; i < lines.size();i++)
        {
            s = s + lines.get(i) + "\n";
        }
        return s;
    }
}
