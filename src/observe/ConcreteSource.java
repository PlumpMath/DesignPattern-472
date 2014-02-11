package observe;

import java.util.Random;

/**
 * Created by siren0413 on 2/10/14.
 */
public class ConcreteSource implements Source{

    private EventHandler handler;
    private Random random;

    public ConcreteSource(){
        handler = new EventHandler();
        random = new Random();
    }

    @Override
    public void addListener(Listener listener) {
        handler.addListener(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        handler.removeListener(listener);
    }

    @Override
    public void createEvent() {
        Event event = new Event(random.nextInt());
        handler.newEvent(event);
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(500);
                createEvent();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
