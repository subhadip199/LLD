package solid.srp;

public class Order {
    private final Long id;

    public Order(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{id=" + id + '}';
    }
}
