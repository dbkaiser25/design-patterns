import java.util.ArrayList;

/**
 * A class that defines a Cassett and how it behaves
 * @author dbkaiser
 */
public class Cassett implements AnalogAlbum {

    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Creates an instance of a Cassett with a list of songs and an index for the current song
     * @param songs
     */
    public Cassett(ArrayList<String> songs) {
        this.songs = songs;
        currentIndex = 0;
    }

    /**
     * Plays the cassett by playing whatever the next song is
     * @return A string of the song being played
     */
    public String play() {
        if(currentIndex == songs.size())
            return "At the end of the cassette you need to rewind";
        else {
            String temp = "Playing song " + (currentIndex + 1) + ": " + songs.get(currentIndex);
            currentIndex++;
            return temp;
        }
    }

    /**
     * Rewinds the cassett by one song
     * @return A string of the cassett being returned
     */
    public String rewind() {
        if(currentIndex == 0)
            return "Fully Re-wound";
        else{
            String temp = "Rewinding to song " + currentIndex;
            currentIndex--;
            return temp;
        }  
    }

    /**
     * Forwards the cassett to the next song
     * @return A string of the cassett being forwarded 
     */
    public String ffwd() {
        if(currentIndex == songs.size() - 1){
            currentIndex++;
            return "Forwarded to the end of the cassette";
        }
        else if(currentIndex == songs.size())
            return "At the end of the cassette you need to rewind";
        else {
            currentIndex++;
            String temp = "Forward to song " + (currentIndex + 1);
            return temp;
        }
    }

    /**
     * Pauses the cassett
     * @return A string of the cassett being paused
     */
    public String pause() {
        return "Pausing...";
    }

    /**
     * Stops the cassett and ejects it
     * @return A string of the cassett being stoped and ejected
     */
    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
}
