package solid.lsp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payment> refundablePayments = List.of(
                new UpiPayment(),
                new CreditCardPayment(),
                new NetBankingPayment()
        );

        List<NonRefundablePayment> nonRefundablePayments = List.of(
                new CryptoPayment()
        );

        PaymentClient paymentClient = new PaymentClient();

        for (Payment payment : refundablePayments) {
            paymentClient.processTransaction(payment);
        }

        for (NonRefundablePayment payment : nonRefundablePayments) {
            paymentClient.processTransaction(payment);
        }
    }
}
