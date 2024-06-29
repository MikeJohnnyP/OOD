package lab7.ex2;

public class Button {
    Switchable switchable;

    public Button(Switchable switchable) {
        this.switchable = switchable;
    }

    public void press() {
        switchable.turnOn();
    }
}
