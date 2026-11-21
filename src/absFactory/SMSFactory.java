package absFactory;

public class SMSFactory implements GeneralFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

    @Override
    public Template createTemplate() {
        return new SMSTemplate();
    }
}
