package factory;

import java.util.ArrayList;
import java.util.List;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type.equals("sms")) {
            return new SMSNotification();
        } else if (type.equals("email")) {
            return new EmailNotification();
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }

    public static List<Notification> createAllNotification(List<String> notificationTypes) {
        List<Notification> notificationList = new ArrayList<>();
        for (String type : notificationTypes) {
            if (type.equals("email")) {
                notificationList.add(new EmailNotification());
            } else if (type.equals("sms")) {
                notificationList.add(new SMSNotification());
            } else
                throw new IllegalArgumentException("Unknown notification type: " + type);

        }
        return notificationList;
    }
}
