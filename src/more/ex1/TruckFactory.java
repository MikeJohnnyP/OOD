package more.ex1;

public class TruckFactory implements VehicleFactory {

  @Override
  public Vehicle createVehicle() {
    return new Truck();
  }

}
