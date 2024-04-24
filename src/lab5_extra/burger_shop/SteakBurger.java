package lab5_extra.burger_shop;

public class SteakBurger extends Burger{

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return  3.0;
    }

    @Override
    public String getName() {
        return "Steak Burger";
    }

    @Override
    public double calorie() {
        return 400;
    }

}
