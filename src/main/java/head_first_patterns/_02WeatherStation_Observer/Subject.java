package head_first_patterns._02WeatherStation_Observer;

/**
 * Created by ivan on 04.06.17.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
