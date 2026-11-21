package solid.lsp;

public class CryptoPayment implements NonRefundablePayment {
    @Override
    public void pay() {
        System.out.println("Paying using crypto");
    }
}
