package factory;

public class Main {
    static void main() {
        OrderService orderService = new OrderService();
        orderService.sendNotification();

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.sendNotification();

        OrderService orderService1 = new OrderService();
        orderService1.sendAllNotification();

    }
}
