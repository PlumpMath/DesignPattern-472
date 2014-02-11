package observe;

/**
 * Created by siren0413 on 2/10/14.
 */
public interface Source extends Runnable{
    public void addListener(Listener listener);
    public void removeListener(Listener listener);
    public void createEvent();
}
