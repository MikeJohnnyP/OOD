package lab7.ex2;

public class Light {

    private boolean on;

    public void turnOn() {
        on = true;
        System.out.println("Light is on");
    }

    public void turnOff() {
        on = false;
        System.out.println("Light is off");
    }

    public boolean isOn() {
        return on;
    }

}
