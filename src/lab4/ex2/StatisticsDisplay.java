package lab4.ex2;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public String toString() {
        return "StatisticsDisplay";
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData temp = (WeatherData) o;
            tempSum += temp.getTemp();
            numReadings++;
            if (temp.getTemp() > maxTemp) {
                maxTemp = temp.getTemp();
            }
            if (temp.getTemp() < minTemp) {
                minTemp = temp.getTemp();
            }
            display();
        }
    }

}
