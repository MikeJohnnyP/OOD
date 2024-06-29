package more.ex2;

public class Motorcycle extends Vehicle{
  private VehiclePartsFactory vehiclePartsFactory;

  public Motorcycle(VehiclePartsFactory vehiclePartsFactory) {
    this.vehiclePartsFactory = vehiclePartsFactory;
  }

  @Override
  public void assembly() {
    System.out.println("Assembling a motorcycle");
    setEnergy(vehiclePartsFactory.createEnergy());
    setWheel(vehiclePartsFactory.createWheel());
    setDoor(vehiclePartsFactory.createDoor());
    setEngine(vehiclePartsFactory.createEngine());
    setTire(vehiclePartsFactory.createTire());
  }

}
