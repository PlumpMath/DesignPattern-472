package observe;

/**
 * Created by siren0413 on 2/10/14.
 */
public class ConcreteListener implements Listener{
    private String name;
    public ConcreteListener(String name){this.name = name;}
    @Override
    public void getEvent(Event event) {
        System.out.println("["+ name +"] get number: " + event.getNum());
    }
}
