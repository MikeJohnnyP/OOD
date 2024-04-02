package lab4.ex1;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject data) {
        data.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temp + "\tHumidity: " + humidity + "\tPresure: " + pressure);
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay";
    }

}
