package pattern.factory.Model;

import pattern.factory.interfces.Notification;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		  System.out.println("Sending an e-mail notification");
		
	}

}
