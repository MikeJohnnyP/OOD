package lab5.cafe_Starbuzz;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.clearDescription();
        super.setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
