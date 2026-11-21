package solid.srp;

public class EmailService {
    public void sendEmail() {
        System.out.println("Sending email");
    }

    public void sendOrderConfirmation(String email) {
        System.out.println("Sending order confirmation to: " + email);
    }

    public void sendPasswordReset(String email) {
        System.out.println("Sending password reset email to: " + email);
    }

    public void sendWelcomeEmail(String email) {
        System.out.println("Sending welcome email to: " + email);
    }

    public void sendInvoiceEmail(String email, Long invoiceId) {
        System.out.println("Sending invoice " + invoiceId + " to: " + email);
    }
}
