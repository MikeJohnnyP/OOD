package lab5_extra.online_shopping_plaform;

public class Mouse extends AddOns {

    public Mouse(BaseProduct baseProduct) {
        super(baseProduct);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Mouse, ";
    }

    @Override
    public double cost() {
        return super.cost() + 15;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Addons: " + getDescription() + "\nCost: $" + cost();
    }
}
