package absFactory;


public class Main {
    static void main() {
        OrderService orderService = new OrderService();
        orderService.sendNotification();

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.sendNotification();

    }
}
