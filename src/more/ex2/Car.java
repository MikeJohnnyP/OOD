package more.ex2;

public class Car extends Vehicle {
  private VehiclePartsFactory vehicleFactory;

  public Car(VehiclePartsFactory vehicleFactory) {
    this.vehicleFactory = vehicleFactory;
  }
  @Override
  public void assembly() {
    System.out.println("Assembling a car");
    setEnergy(vehicleFactory.createEnergy());
    setWheel(vehicleFactory.createWheel());
    setDoor(vehicleFactory.createDoor());
    setEngine(vehicleFactory.createEngine());
    setTire(vehicleFactory.createTire());
  }

}
