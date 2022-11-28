/**
 * A class that accesses functionality for CD and Cassett while using the same commands
 * @author dbkaiser
 */
public class AnalogAdapter implements AnalogAlbum {

    private DigitalAlbum album;

    /**
     * Creates an instance of the class with an album to call the necessary methods
     * @param album The album of which to call the commands
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * Plays the album 
     * @return A string of the album being played
     */
    public String play() {
        return album.nextSong();   
    }

    /**
     * Rewinds the album
     * @return A String of the album being rewind
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * Forwards the album to the next song
     * @return A string of forwarding the album
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * Pauses the album
     * @return A string of the album being paused
     */
    public String pause() {
        return album.pause();
    }

    /**
     * Stops and ejects the album
     * @return A string of the album being stopped and ejected 
     */
    public String stopEject() {
        return album.stop();
    }
}
