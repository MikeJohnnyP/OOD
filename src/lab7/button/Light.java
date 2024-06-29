package lab7.button;

public class Light {

  private boolean on;

  public void on() {
    System.out.println("Light is on");
    on = true;
  }

  public void off() {
    System.out.println("Light is off");
    on = false;
  }

  public boolean isOn() {
    return on;
  }
}
