package lab4.ex1;

public class TestMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(
        weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasure(80.0f, 60.0f, 30.4f);
        weatherData.setMeasure(82.0f, 70.0f, 29.2f);
        weatherData.setMeasure(78.0f, 90.0f, 29.2f);
    }

}
