package more.ex2;

import java.util.ArrayList;

public class CarPartsFactory implements VehiclePartsFactory {

  @Override
  public Energy createEnergy() {
    return new Gasoline();
  }

  @Override
  public Wheel createWheel() {
    return new FourWheel();
  }

  @Override
  public Door createDoor() {
    return new FourDoors();
  }

  @Override
  public ArrayList<Engine> createEngine() {
    ArrayList<Engine> engines = new ArrayList<Engine>();
    engines.add(new Camshaft());
    engines.add(new CylinderHeads());
    engines.add(new Valves());
    return engines;
  }

  @Override
  public Tire createTire() {
    return new AllSeasonTire();
  }

}
