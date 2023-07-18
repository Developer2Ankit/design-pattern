package pattern.factory.Model;

import pattern.factory.interfces.Notification;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		 System.out.println("Sending an SMS notification");
		
	}
}
