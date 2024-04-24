package lab5.cafe_Starbuzz;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
        super.clearDescription();
        beverage.setDescription("Mocha");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

}
