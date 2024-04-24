package lab5_extra.burger_shop;

public class ChiliSauce extends ToppingDecorator {

    public ChiliSauce(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + "ChiliSauce, ";
    }

    @Override
    public double cost() {
        return burger.cost() + 0.5;
    }

    @Override
    public String getName() {
        return burger.getName();
    }

    @Override
    public double calorie() {
        return burger.calorie() + 50;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Description: " + getDescription() + "\n" + "Cost: " + cost() + "\n"
                + "Calorie: " + calorie();
    }

}