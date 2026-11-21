package factory;

public class DeliveryService {
    public void sendNotification() {
        Notification notification = NotificationFactory.createNotification("email");
        notification.send("Your delivery is on the way.");
    }
}
