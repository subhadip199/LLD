package factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderService {
    public void sendNotification() {
        Notification notification = NotificationFactory.createNotification("sms");
        notification.send("Your order has been placed.");
    }

    public void sendAllNotification() {
        List<Notification> notifications = NotificationFactory.createAllNotification(new ArrayList<>(Arrays.asList("email", "sms")));
        for (Notification notification : notifications) {
            notification.send("Your order has been placed.");
        }
    }
}
