package state;

/**
 * A class for a type of state: The netflix state
 * @author dbkaiser
 */
public class NetflixState implements State
{
    private TV tv;
    private String[] movies = new String[4];
    private String[] tvShows = new String[4];

    public NetflixState(TV tv)
    {
        movies[0] = "The Land Before Time";
        movies[1] = "Frozen";
        movies[2] = "The Little Mermaid";
        movies[3] = "Ice Age";

        tvShows[0] = "Peppa Pig";
        tvShows[1] = "My Little Pony";
        tvShows[2] = "Garfield";
        tvShows[3] = "Teenage Mutant Ninja Turtles";
        this.tv = tv;
    }

    /**
     * Action to perform when the home button is pressed
     * @return A string of of the action 
     */
    public String pressHomeButton()
    {
        tv.setState(tv.getHomeState());
        return "Loading the Home Screen...\n";
    }

    /**
     * Action to perform when the Netflix button is pressed
     * @return A string of of the action 
     */
    public String pressNetflixButton()
    {
        tv.setState(this);
        return "We are already in Netflix\n";
    }

    /**
     * Action to perform when the Hulu button is pressed
     * @return A string of of the action 
     */
    public String pressHuluButton()
    {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    /**
     * Action to perform when movie button is pressed
     * @return A string of of the action 
     */
    public String pressMovieButton()
    {
        String temp = "Netflix Movies:\n";
        for(int i = 0; i < movies.length; i++)
        {
            temp = temp + "- " + movies[i] + "\n";
        }
        return temp;
    }

    /**
     * Action to perform when tv button is pressed
     * @return A string of of the action 
     */
    public String pressTVButton()
    {
        String temp = "Netflix TV Shows:\n";
        for(int i = 0; i < tvShows.length; i++)
        {
            temp = temp + "- " + tvShows[i] + "\n";
        }
        return temp;
    }
}
