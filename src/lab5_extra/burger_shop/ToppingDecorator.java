package lab5_extra.burger_shop;

public class ToppingDecorator extends Burger {

    protected Burger burger;

    public ToppingDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription();
    }

    @Override
    public double cost() {
        return burger.cost();
    }

    @Override
    public String getName() {
        return burger.getName();
    }

    @Override
    public double calorie() {
        return burger.calorie();
    }

    @Override
    public String toString() {
        return burger.toString();
    }
}
