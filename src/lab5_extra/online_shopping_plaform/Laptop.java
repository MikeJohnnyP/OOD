package lab5_extra.online_shopping_plaform;

public class Laptop extends BaseProduct {

    @Override
    public String getName() {
        return "Laptop";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return 800;
    }

}
