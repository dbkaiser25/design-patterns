package decorator;

/**
 * Defines how a Chirstmas Tree will look
 * @author dbkaiser
 */
public class ChristmasTree extends Tree
{
    public ChristmasTree()
    {
        super(FileReader.getLines("decorator/txt/tree.txt"));
    } 
}
