package state;


/**
 * A class for a type of state: the HomeState
 * @author dbkaiser
 */
public class HomeState implements State
{
    //the TV object the state belongs to
    private TV tv;

    public HomeState(TV tv)
    {
        this.tv = tv;
    }

    /**
     * The action performed when the home button is pressed for this state
     * @return A string of the action being performed
     */
    public String pressHomeButton()
    {
        tv.setState(this);
        return "TV is already on the home screen\n";
    }

    /**
     * Action to perform when netflix button is pressed
     * @return A string of the action
     */
    public String pressNetflixButton()
    {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    /**
     * Action to perform when Hulu button is pressed
     * @return A string of the action
     */
    public String pressHuluButton()
    {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    /**
     * Action to perform when Movie button is pressed
     * @return A string of the movies
     */
    public String pressMovieButton()
    {
        return "Home: You must pick an app to show movies.";
    }

    /**
     * Action to perform when the Tv Button is pressed
     * @return A string of of the action 
     */
    public String pressTVButton()
    {
        return "Home: You must pick an app to show tv shows";
    }
}
