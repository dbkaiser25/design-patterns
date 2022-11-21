package state;

public class TV 
{
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    public TV()
    {
        state = HomeState;
        NetflixState = new NetflixState(this);
        HomeState = new HomeState(this);
        HuluState = new HuluState(this);
        state = new HomeState(this);
        //setState(HomeState);
        //setState(null);
        //state = null;
    }

    public String pressHomeButton()
    {
        //setState(HomeState);
        String temp = state.pressHomeButton();
        //state = HomeState;
        return temp;
    }

    public String pressNetflixButton()
    {
        String temp = state.pressNetflixButton();
        //state = NetflixState;
        return temp;
    }

    public String pressHuluButton()
    {
        String temp = state.pressHuluButton();
        //state = HuluState;
        return temp;
    }

    public String pressMovieButton()
    {
        //String temp = state.pressMovieButton();
        return state.pressMovieButton();
    }

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
