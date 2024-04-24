package lab5_extra.online_shopping_plaform;

public class HeadPhoneInEar extends AddOns {

    public HeadPhoneInEar(BaseProduct baseProduct) {
        super(baseProduct);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "HeadPhoneInEar, ";
    }

    @Override
    public double cost() {
        return super.cost() + 10;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Addons: " + getDescription() + "\nCost: $" + cost();
    }

}
