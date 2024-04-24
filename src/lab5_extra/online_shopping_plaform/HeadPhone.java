package lab5_extra.online_shopping_plaform;

public class HeadPhone extends AddOns {

    public HeadPhone(BaseProduct baseProduct) {
        super(baseProduct);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "HeadPhone, ";
    }

    @Override
    public double cost() {
        return super.cost() + 20;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Addons: " + getDescription() + "\nCost: $" + cost();
    }

}
