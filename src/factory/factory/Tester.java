package factory.factory;

/**
 * Created by siren0413 on 2/10/14.
 */
public class Tester {
    public static void main(String[] args){
        Factory fa = ProductAFactory.getFactory();
        Factory fb = ProductBFactory.getFactory();
        Product pa = fa.getProduct();
        Product pb = fb.getProduct();
        System.out.println(pa.toString());
        System.out.println(pb.toString());
    }


}
