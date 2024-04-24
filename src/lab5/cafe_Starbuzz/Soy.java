package lab5.cafe_Starbuzz;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
        super.clearDescription();
        setDescription("Soy");

    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

}
