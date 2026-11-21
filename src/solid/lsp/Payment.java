package solid.lsp;

public interface Payment extends NonRefundablePayment {
    void refund();
}
