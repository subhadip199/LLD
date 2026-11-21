package absFactory;

public class EmailTemplate implements Template {

    @Override
    public void format() {
        System.out.println("Formatting email template...");
    }
}
