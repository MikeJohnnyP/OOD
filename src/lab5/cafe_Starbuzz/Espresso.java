package lab5.cafe_Starbuzz;

public class Espresso extends Beverage {

    public Espresso() {
        super.clearDescription();
        super.setDescription("Espresso Coffee");
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
