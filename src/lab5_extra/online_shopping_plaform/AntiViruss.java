package lab5_extra.online_shopping_plaform;

public class AntiViruss extends AddOns {

    public AntiViruss(BaseProduct baseProduct) {
        super(baseProduct);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "AntiVirus, ";
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
