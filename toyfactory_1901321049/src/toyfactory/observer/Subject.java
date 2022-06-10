package toyfactory.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject  implements Observable {

	private List<Observer> observers;
	private String subject;
	
	public Subject() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setSubject(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		observer.setSubject(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		this.notifyObservers();
	}
}
