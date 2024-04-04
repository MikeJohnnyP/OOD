package lab4.ex1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer ob) {
        observerList.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observerList.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob : observerList) {
            ob.update(temp, humidity, pressure);
        }
    }

    public void setMeasure(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

}
