package lab5_extra.online_shopping_plaform;

public abstract class BaseProduct {

    public abstract String getName();

    public abstract String getDescription();

    public abstract double cost();

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + getDescription() + "\nCost: $" + cost();
    }
}
