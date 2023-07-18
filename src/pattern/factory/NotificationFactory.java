package pattern.factory;

import pattern.factory.Model.EmailNotification;
import pattern.factory.Model.PushNotification;
import pattern.factory.Model.SMSNotification;
import pattern.factory.interfces.Notification;

public class NotificationFactory {
	 public Notification createNotification(String channel)
	    {
	        if (channel == null || channel.isEmpty())
	            return null;
	        switch (channel) {
	        case "SMS":
	            return new SMSNotification();
	        case "EMAIL":
	            return new EmailNotification();
	        case "PUSH":
	            return new PushNotification();
	        default:
	            throw new IllegalArgumentException("Unknown channel "+channel);
	        }
	    }
}
