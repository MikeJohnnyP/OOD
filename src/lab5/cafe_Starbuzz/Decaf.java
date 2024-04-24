package lab5.cafe_Starbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        super.clearDescription();
        super.setDescription("Decaf Coffee");
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
