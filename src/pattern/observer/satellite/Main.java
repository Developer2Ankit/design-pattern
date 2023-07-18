package pattern.observer.satellite;

import pattern.observer.satellite.interfaces.Observer;
import pattern.observer.satellite.model.EmailTopic;
import pattern.observer.satellite.model.EmailTopicSubscriber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmailTopic topic=new EmailTopic();
//create observer
Observer firstObserver=new EmailTopicSubscriber("First Observer");
Observer secondObserver=new EmailTopicSubscriber("2nd Observer");
Observer thirdObserver=new EmailTopicSubscriber("Third Observer");
Observer fourthObserver=new EmailTopicSubscriber("Fourth Observer");
//register them

topic.register(firstObserver);
topic.register(secondObserver);
topic.register(thirdObserver);
topic.register(fourthObserver);

//attacheing observer to subject

firstObserver.setSubject(topic);
secondObserver.setSubject(topic);
thirdObserver.setSubject(topic);
fourthObserver.setSubject(topic);

//check for update
firstObserver.update();
thirdObserver.update();
//Provider//Subject(Broadcoster)
topic.postMessage("Hello Subscriber!");

topic.unRegister(firstObserver);
topic.postMessage("Hello Subscriber!");

	}

}
