package solid.ocp;

public class Main {
    public static void main(String[] args) {
        PaymentService upiPayment = new UpiPayment();
        PaymentService creditCardPayment = new CreditCardPayment();
        PaymentService netBankingPayment = new NetBankingPayment();

        upiPayment.processPayment(500.0);
        creditCardPayment.processPayment(1200.0);
        netBankingPayment.processPayment(3000.0);
    }
}
