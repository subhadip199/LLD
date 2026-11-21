package solid.lsp;

public class NetBankingPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying using net banking");
    }

    @Override
    public void refund() {
        System.out.println("Refunding net banking payment");
    }
}
