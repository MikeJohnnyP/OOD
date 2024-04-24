package lab5.cafe_Starbuzz;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
        super.clearDescription();
        setDescription("Milk");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

}
