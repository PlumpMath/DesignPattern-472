package observe;

import java.util.*;

/**
 * Created by siren0413 on 2/10/14.
 */
public class EventHandler {

    private ArrayList<Listener> listenerList;

    public EventHandler(){
        listenerList = new ArrayList<Listener>();
    }

    public void addListener(Listener listener) {
        listenerList.add(listener);
    }

    public void removeListener(Listener listener) {
        listenerList.remove(listener);
    }

    public void newEvent(Event event){
        for(Listener listener: listenerList)
            listener.getEvent(event);
    }
}
