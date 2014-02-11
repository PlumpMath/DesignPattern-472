package factory.factory;

/**
 * Created by siren0413 on 2/10/14.
 */
public class ProductAFactory implements Factory{
    private static ProductAFactory instance = null; // singleton
    private ProductAFactory(){}

    @Override
    public Product getProduct() {
        return new ProductA();
    }

    public static ProductAFactory getFactory(){
        if(instance == null) instance = new ProductAFactory();
        return instance;
    }
}
