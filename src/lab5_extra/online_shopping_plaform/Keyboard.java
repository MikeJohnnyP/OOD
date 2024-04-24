package lab5_extra.online_shopping_plaform;

public class Keyboard extends AddOns {

    public Keyboard(BaseProduct baseProduct) {
        super(baseProduct);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Keyboard, ";
    }

    @Override
    public double cost() {
        return super.cost() + 30;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Addons: " + getDescription() + "\nCost: $" + cost();
    }

}
