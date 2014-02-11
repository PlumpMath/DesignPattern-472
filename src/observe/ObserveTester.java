package observe;

/**
 * Created by siren0413 on 2/10/14.
 */
public class ObserveTester {
    public static void main(String[] args){
        Source concreteSouce = new ConcreteSource();
        Listener concreteListenerA = new ConcreteListener("A");
        Listener concreteListenerB = new ConcreteListener("B");
        Listener concreteListenerC = new ConcreteListener("C");
        concreteSouce.addListener(concreteListenerA);
        concreteSouce.addListener(concreteListenerB);
        concreteSouce.addListener(concreteListenerC);
        Thread t = new Thread(concreteSouce);
        t.start();

    }
}
