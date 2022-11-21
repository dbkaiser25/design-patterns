package decorator;

public class Ornaments extends TreeDecorator 
{
    private Tree tree;
    
    public Ornaments(Tree tree)
    {
        //this.tree = tree;
        super.integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
    }
}
