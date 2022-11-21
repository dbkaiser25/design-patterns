package decorator;

import java.util.ArrayList;

/**
 * Class that defines how decorations will look for a tree
 */
public class TreeDecorator extends Tree
{
    /**
     * A tree must exist and be defined before the decorations can be created
     */
    public TreeDecorator()
    {
        super(FileReader.getLines("decorator/txt/tree.txt"));
    }

    /**
     * An array list that contains the decorations for a tree
     * @param decor the name of the array list
     */
    protected void integrateDecor(ArrayList<String> decor)
    {
        //TODO i believe this is the method to combine both of them or sum shit
        //super(decor);

        ArrayList<String> newAL = new ArrayList();

        for(int i = 0; i < decor.size(); i++)
        {
            char[] chLines = lines.get(i).toCharArray();
            char[] chDecor = decor.get(i).toCharArray();
            
            for(int j = 0; j < chLines.length; j++)
            {
                if((chDecor[j] != ' ') && (chLines[j] == ' '))
                {
                    chLines[j] = chDecor[j];
                }
            }

            //String str = String.valueOf(chLines);
            newAL.add(String.valueOf(chLines));
            
            //for(int j = 0; j < lines.size(); j++)
            //{
                //if((lines.get(i).charAt(j) == " ") && (i == 1))
                //if(decor.get(i).indexOf(" ") == -1)
                //{

                //}
            //}
        }

        //lines.clear();
        lines = newAL;
        //for(int i = 0; i < newAL.size(); i++)
        //{
            //lines
        //}


    }
}
