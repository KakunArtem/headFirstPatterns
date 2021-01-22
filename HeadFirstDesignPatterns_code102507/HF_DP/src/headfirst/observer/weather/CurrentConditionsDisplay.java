package observer.weather;

public class CurrentConditionsDisplay implements headfirst.observer.weather.Observer, headfirst.observer.weather.DisplayElement {
	private float temperature;
	private float humidity;
	private headfirst.observer.weather.Subject weatherData;
	
	public CurrentConditionsDisplay(headfirst.observer.weather.Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
