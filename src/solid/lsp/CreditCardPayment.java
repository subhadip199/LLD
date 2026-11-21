package solid.lsp;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying using credit card");
    }

    @Override
    public void refund() {
        System.out.println("Refunding credit card payment");
    }
}
