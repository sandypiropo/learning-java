import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> items;
    private Cliente client;

    public Order(LocalDateTime moment, OrderStatus status, List<OrderItem> items, Cliente client) {
        this.moment = moment;
        this.status = status;
        this.items = items;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    public double total() {
        returh;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Cliente getClient() {
        return client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append()
        return sb;
    }
}
