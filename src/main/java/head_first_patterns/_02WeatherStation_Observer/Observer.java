package head_first_patterns._02WeatherStation_Observer;

/**
 * Created by ivan on 04.06.17.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
