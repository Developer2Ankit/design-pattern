package pattern.observer.satellite.model;

import pattern.observer.satellite.interfaces.Observer;
import pattern.observer.satellite.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

	private String name;
	private Subject topic;
	
	
	public EmailTopicSubscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		String msg=(String)topic.getUpdate(this);
		if(msg==null) {
			System.out.println(name+" No new message on this topic!");
		}else {
			System.out.println(name+" Retrieving message:"+msg);
		}
		
	}

	@Override
	public void setSubject(Subject subject) {
	this.topic=subject;
		
	}
	

}
