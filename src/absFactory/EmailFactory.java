package absFactory;

public class EmailFactory implements GeneralFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

    @Override
    public Template createTemplate() {
        return new EmailTemplate();
    }
}
