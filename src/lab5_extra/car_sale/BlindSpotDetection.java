package lab5_extra.car_sale;

public class BlindSpotDetection extends Decorator{
    public final double BLD_COST = 1000.0;

    public BlindSpotDetection(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Blind Spot Detection,";
    }

    @Override
    public double cost() {
        return super.cost() + BLD_COST;
    }



}
