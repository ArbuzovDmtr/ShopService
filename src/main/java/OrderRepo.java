import java.util.List;

public interface OrderRepo {


    //add, remove, getById, getAll
    void addOrder(Order order);
    void removeOrder(int id);
    void removeOrders();
    Order getOrderById(int id);
    List<Order> getOrders();

}
