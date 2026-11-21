package absFactory;

public class OrderService {
    public void sendNotification() {
        GeneralFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();

        notification.send("Your order has been placed.");

        Template template = factory.createTemplate();
        template.format();
    }
}
