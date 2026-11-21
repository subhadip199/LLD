package adapter;

public class PaypalGateway {
    public int doTransaction(Double value, int userId) {
        // Implementation for PayPal transaction
        System.out.println("Performing PayPal transaction for value: " + value + " and userId: " + userId);
        return 1; // Placeholder return value
    }
}
