import java.util.ArrayList;

/**
 * A class that defines a CD object and how it can be interacted
 * @dbkaiser
 */
public class CD implements DigitalAlbum {
    
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Creates an instance of a CD with a list of songs and index of the current song
     * @param songs the name of the list of songs
     */
    public CD(ArrayList<String> songs) {
        this.songs = songs;
        currentIndex = -1;
    }

    /**
     * Starts playing the CD from the beginning
     * @return A string of the song being played
     */
    public String playFromBeginning() {
        currentIndex = 0;
        return "Playing song 1 " + songs.get(currentIndex);
    }

    /**
     * Plays the song at the given index 
     * @param num the index of the song to be played
     * @return A string of the song that is to be played
     */
    public String playSong(int num) {
        currentIndex = num;
        return "Playing " + currentIndex + ": " + songs.get(currentIndex);
    }

    /**
     * Plays the previous song on the album based on the current index
     * @return A string of the previous song to be played
     */
    public String prevSong() {
        if(currentIndex == 0){
            String temp = "Playing " + currentIndex + ": " + songs.get(currentIndex);
            return temp;
        }
        else if (currentIndex == songs.size()){
            currentIndex -= 2;
            return "Skipping back and playing: " + songs.get(currentIndex);
        }
        else{
            currentIndex--;
            return "Skipping back and playing: " + songs.get(currentIndex);
        }
    }

    /**
     * Plays the next song on the CD based on the current index
     * @return A string of the enxt song to played
     */
    public String nextSong() {
        if(currentIndex == songs.size())
            currentIndex = 0;
        currentIndex++;
        String temp = "Playing: " + (currentIndex + 1) + ": " + songs.get(currentIndex);
        return temp;
    }

    /**
     * Stops playing the CD
     * @return A string of the CD being stopped
     */
    public String stop() {
        return "Stopping";
    }

    /**
     * Pauses the CD
     * @return A string of the CD being paused
     */
    public String pause() {
        return "Pausing";
    }
}