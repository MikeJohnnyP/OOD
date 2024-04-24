package lab5_extra.burger_shop;

public class ChicagoBurger extends Burger {

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String getName() {
        return "Chicago Burger";
    }

    @Override
    public double calorie() {
        return 300;
    }

}
