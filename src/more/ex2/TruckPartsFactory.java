package more.ex2;

import java.util.ArrayList;

public class TruckPartsFactory implements VehiclePartsFactory{

  @Override
  public Energy createEnergy() {
    return new Gasoline();
  }

  @Override
  public Wheel createWheel() {
    return new EightWheel();
  }

  @Override
  public Door createDoor() {
    return new TwoDoors();
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
