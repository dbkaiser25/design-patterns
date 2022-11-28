/**
 * An interface that defines how an analog album can behave
 * @author dbkaiser
 */
public interface AnalogAlbum {
    public String play();
    public String rewind();
    public String ffwd();
    public String pause();
    public String stopEject();
}
