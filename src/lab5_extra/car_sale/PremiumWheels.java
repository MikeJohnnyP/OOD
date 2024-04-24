package lab5_extra.car_sale;

public class PremiumWheels extends Decorator {
    public final double PREMIUM_WHEELS_COST = 2000.0;

    public PremiumWheels(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Premium Wheels, ";
    }

    @Override
    public double cost() {
        return super.cost() + PREMIUM_WHEELS_COST;
    }


}
