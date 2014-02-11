package factory.factory;

/**
 * Created by siren0413 on 2/10/14.
 */
public class ProductBFactory implements Factory{
    private static ProductBFactory instance = null; // singleton
    private ProductBFactory(){}
    @Override
    public Product getProduct() {
        return new ProductB();
    }

    public static ProductBFactory getFactory(){
        if(instance == null) instance = new ProductBFactory();
        return instance;
    }
}
