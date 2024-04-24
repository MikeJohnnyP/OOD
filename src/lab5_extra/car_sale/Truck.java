package lab5_extra.car_sale;

public class Truck extends Car {

    @Override
    public String getName() {
        return "Truck";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return 30000.0;
    }


}
