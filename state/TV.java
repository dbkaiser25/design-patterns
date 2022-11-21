package state;

/**
 * A class for a TV object that can have different states
 */
public class TV 
{
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    public TV()
    {
        NetflixState = new NetflixState(this);
        HomeState = new HomeState(this);
        HuluState = new HuluState(this);
        state = new HomeState(this);
        state = HomeState;
    }

    /**
     * Defines the behaviour when event home button is pressed
     * @return A string of the action
     */
    public String pressHomeButton()
    {
        return state.pressHomeButton();
    }

    /**
     * Defines the behaviour when event netflix button is pressed
     * @return A string of the action
     */
    public String pressNetflixButton()
    {
        return state.pressNetflixButton();
    }

    /**
     * Defines the behaviour when event hulu button is pressed
     * @return A string of the action
     */
    public String pressHuluButton()
    {
        return state.pressHuluButton();
    }

    /**
     * Defines the behaviour when event movie button is pressed
     * @return A string of the action
     */
    public String pressMovieButton()
    {
        //String temp = state.pressMovieButton();
        return state.pressMovieButton();
    }

    /**
     * Defines the behaviour when tv button is pressed
     * @return A string of the action
     */
    public String pressTVButton()
    {

        return state.pressTVButton();
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public State getHomeState()
    {
        return HomeState;
    }

    public State getNetflixState()
    {
        return NetflixState;
    }

    public State getHuluState()
    {
        return HuluState;
    }

}
