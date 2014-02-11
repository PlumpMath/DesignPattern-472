package factory.simplefactory;

/**
 * Created by siren0413 on 2/10/14.
 */
public class Tester {
    public static void main(String[] args){
        ProductFactory factory = ProductFactory.getFactory();
        Product pa = factory.getProduct("ProductA1");
        Product pb = factory.getProduct("ProductB1");
        System.out.println(pa.toString());
        System.out.println(pb.toString());
    }
}
