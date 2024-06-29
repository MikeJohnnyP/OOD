package more.ex1;

public class Main {
  public static void main(String[] args) {
    VehicleFactory factory = new CarFactory();
    Vehicle vehicle = factory.createVehicle();
    vehicle.drive();

    factory = new MotorcycleFactory();
    vehicle = factory.createVehicle();
    vehicle.drive();

    factory = new TruckFactory();
    vehicle = factory.createVehicle();
    vehicle.drive();
  }
}
