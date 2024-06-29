package more.ex1;

public class MotorcycleFactory implements VehicleFactory {

  @Override
  public Vehicle createVehicle() {
    return new Motorcycle();
  }

}
