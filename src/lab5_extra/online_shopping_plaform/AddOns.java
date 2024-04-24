package lab5_extra.online_shopping_plaform;

public class AddOns extends BaseProduct {
    private BaseProduct baseProduct;

    public AddOns(BaseProduct baseProduct) {
        this.baseProduct = baseProduct;
    }

    @Override
    public String getName() {
        return baseProduct.getName();
    }

    @Override
    public String getDescription() {
        return baseProduct.getDescription();
    }

    @Override
    public double cost() {
        return baseProduct.cost();
    }

    @Override
    public String toString() {
        return baseProduct.toString();
    }

}
