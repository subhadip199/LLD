package adapter;

public class Main {
    public static void main(String[] args) {
        PaymentService razorpayAdapter = new RazorpayAdapter(new RazorpayGateway());
        PaymentClient client = new PaymentClient(razorpayAdapter);
        client.makePayment();

        PaymentService paypalAdapter = new PaypalAdapter(new PaypalGateway());
        PaymentClient client2 = new PaymentClient(paypalAdapter);
        client2.makePayment();
    }
}
