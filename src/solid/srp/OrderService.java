package solid.srp;

public class OrderService {
    public void createOrder() {
        System.out.println("Creating order");
    }

    public void cancelOrder(Long id) {
        System.out.println("Cancelling order: " + id);
    }

    public void updateOrder(Long id) {
        System.out.println("Updating order: " + id);
    }

    public Order getOrderById(Long id) {
        System.out.println("Fetching order: " + id);
        return new Order(id);
    }
}
