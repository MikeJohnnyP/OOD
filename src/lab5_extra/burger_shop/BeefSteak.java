package lab5_extra.burger_shop;

public class BeefSteak extends ToppingDecorator {

    public BeefSteak(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + "BeefSteak, ";
    }

    @Override
    public double cost() {
        return burger.cost() + 1.5;
    }

    @Override
    public String getName() {
        return burger.getName();
    }

    @Override
    public double calorie() {
        return burger.calorie() + 200;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Description: " + getDescription() + "\n" + "Cost: " + cost() + "\n"
                + "Calorie: " + calorie();
    }


}
