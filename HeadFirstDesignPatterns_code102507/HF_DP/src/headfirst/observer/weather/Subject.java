package headfirst.observer.weather;

public interface Subject {
	public void registerObserver(headfirst.observer.weather.Observer o);
	public void removeObserver(headfirst.observer.weather.Observer o);
	public void notifyObservers();
}
