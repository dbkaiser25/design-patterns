package state;

/**
 * A class for a type of state: the hulu state
 */
public class HuluState implements State
{
    private TV tv;
    private String[] movies = new String[4];
    private String[] tvShows = new String[3];

   
    public HuluState(TV tv)
    {
        movies[0] = "Cars";
        movies[1] = "Cinderella";
        movies[2] = "Wall-E";
        movies[3] = "ET";

        tvShows[0] = "sesame street";
        tvShows[1] = "care bears";
        tvShows[2] = "loney tunes";
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
     * Action to perform when the netflix button is pressed
     * @return A string of of the action 
     */
    public String pressNetflixButton()
    {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    /**
     * Action to perform when the hulu button is pressed
     * @return A string of of the action 
     */
    public String pressHuluButton()
    {
        tv.setState(this);
        return "We are already in Hulu\n";
    }

    /**
     * Action to perform when the movie button is pressed 
     * @return A string of of the action 
     */
    public String pressMovieButton()
    {
        String temp = "Hulu Movies:\n";
        for(int i = 0; i < movies.length; i++)
        {
            temp = temp + "- " + movies[i] + "\n";
        }
        return temp;
    }

    /**
     * Action to perform when tv shows button is pressed
     * @return A string of of the action 
     */
    public String pressTVButton()
    {
        String temp = "Hulu TV Shows:\n";
        for(int i = 0; i < tvShows.length; i++)
        {
            temp = temp + "- " + tvShows[i] + "\n";
        }
        return temp;
    }
}
