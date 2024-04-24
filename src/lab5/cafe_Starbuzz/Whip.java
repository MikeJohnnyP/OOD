package lab5.cafe_Starbuzz;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
        super.clearDescription();
        beverage.setDescription("Whip");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
