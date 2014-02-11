package factory.simplefactory;

/**
 * Created by siren0413 on 2/10/14.
 */
public class ProductFactory {
    private static ProductFactory instance = null; // singleton
    private ProductFactory(){}

    public Product getProduct(String name){
        if(name.equals("ProductA1")) return new ProductA();
        if(name.equals("ProductB1")) return new ProductB();
        return null;
    }

    public static ProductFactory getFactory(){
        if(instance == null) instance = new ProductFactory();
        return instance;
    }

}
