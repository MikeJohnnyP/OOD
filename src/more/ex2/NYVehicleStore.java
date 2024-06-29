package more.ex2;

public class NYVehicleStore extends VehicleStore {
  public Vehicle createVehicle(VehicleType type) {
    Vehicle vehicle = null;
    VehiclePartsFactory temp;
    System.out.println("Preparing to create a vehicle");
    switch (type) {
      case CAR:
        temp = new CarPartsFactory();
        vehicle = new Car(temp);
        break;
      case TRUCK:
        temp = new TruckPartsFactory();
        vehicle = new Truck(temp);
        break;
      case MOTORCYCLE:
        temp = new MotorcyclePartsFactory();
        vehicle = new Motorcycle(temp);
        break;
    }
    System.out.println("Boxing the vehicle");
    System.out.println("Shipping the vehicle");
    return vehicle;
  }
}
