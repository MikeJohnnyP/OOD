package lab4.ex2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temp + "\tHumidity: " + humidity + "\tPresure: " + pressure);
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay";
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData temp = (WeatherData) o;
            this.temp = temp.getTemp();
            this.humidity = temp.getHumidity();
            this.pressure = temp.getPressure();
            display();
        }
    }

}
