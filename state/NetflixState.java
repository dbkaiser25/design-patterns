package state;

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

    public String pressHomeButton()
    {
        tv.setState(tv.getHomeState());
        return "Loading the Home Screen...\n";
    }

    public String pressNetflixButton()
    {
        tv.setState(this);
        return "We are already in Netflix\n";
    }

    public String pressHuluButton()
    {
        tv.setState(tv.getHuluState());
        return "Loading Hulu...\n";
    }

    public String pressMovieButton()
    {
        String temp = "Netflix Movies:\n";
        for(int i = 0; i < movies.length; i++)
        {
            temp = temp + "- " + movies[i] + "\n";
        }
        return temp;
    }

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
