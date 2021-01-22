package ChapterTwo.weatherApp;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(s -> s.update(this.temperature, this.humidity, this.pressure));
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }
}
