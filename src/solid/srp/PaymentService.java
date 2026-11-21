package solid.srp;

public class PaymentService {
    public void processPayment() {
        System.out.println("Processing payment");
    }

    public void refundPayment(Long paymentId) {
        System.out.println("Refunding payment: " + paymentId);
    }

    public void cancelPayment(Long paymentId) {
        System.out.println("Cancelling payment: " + paymentId);
    }

    public boolean validatePayment(Long paymentId) {
        System.out.println("Validating payment: " + paymentId);
        return true;
    }

    public String getPaymentStatus(Long paymentId) {
        System.out.println("Fetching payment status: " + paymentId);
        return "SUCCESS";
    }
}
