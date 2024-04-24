package lab5_extra.burger_shop;

public abstract class Burger {

    public abstract String getDescription();

    public abstract double cost();

    public abstract String getName();

    public abstract double calorie();

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Description: " + getDescription() + "\n" + "Cost: " + cost() + "\n"
                + "Calorie: " + calorie();
    }

}
