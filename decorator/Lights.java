package decorator;

public class Lights extends TreeDecorator 
{
    private Tree tree;

    public Lights(Tree tree)
    {
        //this.tree = tree;
        super.integrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
    }
}
