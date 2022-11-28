/**
 * An interface that defines what can be done with an album
 * @author dbkaiser
 */
public interface DigitalAlbum {
    public String playFromBeginning();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();

}
