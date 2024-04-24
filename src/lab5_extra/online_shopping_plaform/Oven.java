package lab5_extra.online_shopping_plaform;

public class Oven extends BaseProduct {

    @Override
    public String getName() {
        return "Oven";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return 200;
    }

}
