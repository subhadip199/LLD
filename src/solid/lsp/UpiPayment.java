package solid.lsp;

public class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying using UPI");
    }

    @Override
    public void refund() {
        System.out.println("Refunding UPI payment");
    }
}
