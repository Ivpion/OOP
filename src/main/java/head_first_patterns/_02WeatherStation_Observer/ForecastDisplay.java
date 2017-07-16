package head_first_patterns._02WeatherStation_Observer;

/**
 * Created by ivan on 05.06.17.
 */
public class ForecastDisplay implements Observer, DisplayElements {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Forecast conditions: " + temperature + "F degrees and "
                + humidity + "% humidity" );
    }
}
