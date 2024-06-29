package more.ex2;

import java.util.ArrayList;

public class MotorcyclePartsFactory implements VehiclePartsFactory {

  @Override
  public Energy createEnergy() {
    return new Electric();
  }

  @Override
  public Wheel createWheel() {
    return new TwoWheel();
  }

  @Override
  public Door createDoor() {
    return new NoDoor();
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
    return new SportTire();
  }

}
