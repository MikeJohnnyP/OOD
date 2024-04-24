package lab5.cafe_Starbuzz;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.clearDescription();
        super.setDescription("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return 0.99;
    }

}
