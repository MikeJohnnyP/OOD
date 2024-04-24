package lab5_extra.car_sale;

public class Decorator extends Car {
    protected Car car;

    public Decorator(Car car) {
        this.car = car;
    }

    @Override
    public String getName() {
        return car.getName();
    }

    @Override
    public String getDescription() {
        return car.getDescription();
    }

    @Override
    public double cost() {
        return car.cost();
    }


}
