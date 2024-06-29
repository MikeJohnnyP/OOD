package more.ex2;

public class Truck extends Vehicle {
  private VehiclePartsFactory partsFactory;

  public Truck(VehiclePartsFactory partsFactory) {
    this.partsFactory = partsFactory;
  }

  @Override
  public void assembly() {
    System.out.println("Assembling a truck");
    setEnergy(partsFactory.createEnergy());
    setWheel(partsFactory.createWheel());
    setDoor(partsFactory.createDoor()) ;
    setEngine(partsFactory.createEngine());
    setTire(partsFactory.createTire());
  }

  
}
