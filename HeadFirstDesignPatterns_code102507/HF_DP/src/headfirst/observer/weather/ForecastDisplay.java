package observer.weather;


public class ForecastDisplay implements headfirst.observer.weather.Observer, headfirst.observer.weather.DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private headfirst.observer.weather.Subject weatherData;

    public ForecastDisplay(headfirst.observer.weather.Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
