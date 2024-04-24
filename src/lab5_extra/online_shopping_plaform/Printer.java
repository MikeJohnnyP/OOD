package lab5_extra.online_shopping_plaform;

public class Printer extends AddOns {

    public Printer(BaseProduct baseProduct) {
        super(baseProduct);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Printer, ";
    }

    @Override
    public double cost() {
        return super.cost() + 40;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Addons: " + getDescription() + "\nCost: $" + cost();
    }
}
