package lab5_extra.car_sale;

public class TestCarSales {
    public static void main(String[] args) {
        Car car = new PremiumWheels(new GPS(new Mercedes()));
        System.out.println("Name: " + car.getName() + "\nDescription: " +
                car.getDescription() + "\nCost: $" + car.cost() + "\n");

        car = new GPS(new BlindSpotDetection(new PremiumWheels(new Cranes())));
        System.out.println("Name: " + car.getName() + "\nDescription: " +
                car.getDescription() + "\nCost: $" + car.cost() + "\n");

        car = new PremiumWheels(new GPS(new Cranes()));
        System.out.println("Name: " + car.getName() + "\nDescription: " +
                car.getDescription() + "\nCost: $" + car.cost() + "\n");

    }
}
