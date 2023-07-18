package pattern.factory;

import pattern.factory.interfces.Notification;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationFactory notificationFactory = new NotificationFactory();
		 Notification notification = notificationFactory.createNotification("EMAIL");
		 notification.notifyUser();
	}

}
