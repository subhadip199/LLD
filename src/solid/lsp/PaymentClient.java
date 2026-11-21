package solid.lsp;

public class PaymentClient {
    public void processTransaction(Payment payment) {
        payment.pay();
        payment.refund();
    }

    public void processTransaction(NonRefundablePayment payment) {
        payment.pay();
    }
}
