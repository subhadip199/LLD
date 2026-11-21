package solid.ocp;

public class NetBankingPayment implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing net banking payment of ₹" + amount);
    }
}
