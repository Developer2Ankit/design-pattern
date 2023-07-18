package pattern.observer.satellite.model;

import java.util.ArrayList;
import java.util.List;

import pattern.observer.satellite.interfaces.Observer;
import pattern.observer.satellite.interfaces.Subject;

public class EmailTopic  implements Subject{

	private List<Observer>  observers;
	private String message;
	
	
	public EmailTopic() {
		super();
		this.observers = new ArrayList<>();
	}
public void postMessage(String msg) {
	System.out.println("Message posted to my topic:"+msg);
	this.message=msg;
	notifyObserver();
	
}
	@Override
	public void register(Observer observer) {
		if(observer==null) throw new NullPointerException("Null object/Observer ");
		if(!observers.contains(observer)) {
			observers.add(observer);
		}
		
	}

	@Override
	public void unRegister(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer  observer:observers) {
			observer.update();
		}
		
	}

	@Override
	public Object getUpdate(Observer observer) {
		// TODO Auto-generated method stub
		return this.message;
	}

}
