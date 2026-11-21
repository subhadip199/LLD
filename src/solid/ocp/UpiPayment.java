package solid.ocp;

public class UpiPayment implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}
