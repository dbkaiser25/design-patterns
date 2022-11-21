package state;

public class HuluState implements State
{
    private TV tv;
    private String[] movies = new String[4];
    private String[] tvShows = new String[3];

    //how to load in movies and tvShows;
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

    public String pressHomeButton()
    {
        tv.setState(tv.getHomeState());
        return "Loading the Home Screen...\n";
    }

    public String pressNetflixButton()
    {
        tv.setState(tv.getNetflixState());
        return "Loading Netflix...\n";
    }

    public String pressHuluButton()
    {
        tv.setState(this);
        return "We are already in Hulu\n";
    }

    public String pressMovieButton()
    {
        String temp = "Hulu Movies:\n";
        for(int i = 0; i < movies.length; i++)
        {
            temp = temp + "- " + movies[i] + "\n";
        }
        return temp;
    }

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
