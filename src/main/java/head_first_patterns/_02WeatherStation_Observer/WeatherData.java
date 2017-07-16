package head_first_patterns._02WeatherStation_Observer;

import java.util.ArrayList;

/**
 * Created by ivan on 04.06.17.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float preassure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {observers.remove(i);}
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, preassure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float preassure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.preassure = preassure;
        measurementsChanged();
    }

}
