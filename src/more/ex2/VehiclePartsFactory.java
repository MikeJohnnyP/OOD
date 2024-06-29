package more.ex2;

import java.util.ArrayList;

public interface VehiclePartsFactory {
  public Energy createEnergy();
  public Wheel createWheel();
  public Door createDoor();
  public ArrayList<Engine> createEngine();
  public Tire createTire();
}
