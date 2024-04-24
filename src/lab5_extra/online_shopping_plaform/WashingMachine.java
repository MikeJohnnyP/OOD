package lab5_extra.online_shopping_plaform;

public class WashingMachine extends BaseProduct {

    @Override
    public String getName() {
        return "Washing Machine";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return 1000;
    }

}
