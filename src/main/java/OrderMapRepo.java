import java.util.*;

public class OrderMapRepo implements OrderRepo{
    Map<Integer,Order> MapOfOrders= new HashMap<>();



    @Override
    public String toString() {
        return "OrderMapRepo{" +
                "MapOfOrders=" + MapOfOrders +
                '}'+'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderMapRepo that = (OrderMapRepo) o;
        return Objects.equals(MapOfOrders, that.MapOfOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(MapOfOrders);
    }

    @Override
    public void addOrder(Order order) {
        MapOfOrders.put(order.id(),order);

    }

    @Override
    public void removeOrder(int id) {
        MapOfOrders.remove(id);

    }

    @Override
    public void removeOrders() {
        MapOfOrders.clear();

    }

    @Override
    public Order getOrderById(int id) {
        return MapOfOrders.getOrDefault(id, null);
    }

    @Override
    public List<Order> getOrders() {
        return new ArrayList<>(MapOfOrders.values());
    }
}
