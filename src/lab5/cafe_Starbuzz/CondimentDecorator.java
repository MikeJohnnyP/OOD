package lab5.cafe_Starbuzz;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cost() {
        return this.beverage.cost();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(beverage.getDescription() + ", " + description);
    }
}