package solid.srp;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        EmailService emailService = new EmailService();
        InvoiceService invoiceService = new InvoiceService();

        orderService.createOrder();
        orderService.updateOrder(101L);
        orderService.cancelOrder(101L);
        orderService.getOrderById(101L);

        paymentService.processPayment();
        paymentService.validatePayment(201L);
        paymentService.getPaymentStatus(201L);
        paymentService.refundPayment(201L);

        emailService.sendEmail();
        emailService.sendOrderConfirmation("customer@example.com");
        emailService.sendInvoiceEmail("customer@example.com", 301L);

        invoiceService.generateInvoice();
        invoiceService.printInvoice(301L);
        invoiceService.downloadInvoice(301L);
    }
}
