package lab5_extra.car_sale;

public class GPS extends Decorator {
    public final double GPS_COST = 5000.0;

    public GPS(Car car) {
        super(car);
    }

    @Override
    public String getName() {
        return car.getName();
    }

    @Override
    public String getDescription() {
        return car.getDescription() + "GPS, ";
    }

    @Override
    public double cost() {
        return car.cost() + GPS_COST;
    }


}
