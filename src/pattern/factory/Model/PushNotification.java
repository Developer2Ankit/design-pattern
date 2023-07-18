package pattern.factory.Model;

import pattern.factory.interfces.Notification;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending a push notification");
		
	}
}
