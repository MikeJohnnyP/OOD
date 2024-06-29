package more.ex2;

import java.util.ArrayList;

public abstract class Vehicle {
  private Wheel wheel;
  private Tire tire;
  private Energy energy;
  private Door door;
  private ArrayList<Engine> engine;

  public abstract void assembly();

  public Wheel getWheel() {
    return wheel;
  }

  public void setWheel(Wheel wheel) {
    this.wheel = wheel;
  }

  public Tire getTire() {
    return tire;
  }

  public void setTire(Tire tire) {
    this.tire = tire;
  }

  public Energy getEnergy() {
    return energy;
  }

  public void setEnergy(Energy energy) {
    this.energy = energy;
  }

  public ArrayList<Engine> getEngine() {
    return engine;
  }

  public void setEngine(ArrayList<Engine> engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    StringBuffer result = new StringBuffer();
    if (wheel != null) {
      result.append(wheel);
      result.append("\n");
    }
    if (tire != null) {
      result.append(tire);
      result.append("\n");
    }
    if (energy != null) {
      result.append(energy);
      result.append("\n");
    }
    if (door != null) {
      result.append(door);
      result.append("\n");
    }
    if (engine != null) {
      for (int i = 0; i < engine.size(); i++) {
        result.append(engine.get(i));
        if (i < engine.size() - 1) {
          result.append(", ");
        }
      }
      result.append("\n");
    }

    return result.toString();
  }

  public Door getDoor() {
    return door;
  }

  public void setDoor(Door door) {
    this.door = door;
  }

}
