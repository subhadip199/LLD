package absFactory;

public class DeliveryService {
    public void sendNotification() {
        GeneralFactory factory = new SMSFactory();
        Notification notification = factory.createNotification();

        notification.send("Your order has been shipped.");

        Template template = factory.createTemplate();
        template.format();
    }
}
