import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo {

private List<Order> ListOfOrders= new ArrayList<>();

    public OrderListRepo(List<Order> listOfOrders) {
        ListOfOrders = listOfOrders;
    }

    public OrderListRepo() {
    }

    public List<Order> getListOfOrders() {
        return ListOfOrders;
    }

    public void setListOfOrders(List<Order> listOfOrders) {
        ListOfOrders = listOfOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(ListOfOrders, that.ListOfOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ListOfOrders);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "ListOfOrders=" + ListOfOrders +
                '}';
    }


    public void addOrder(Order order){
        ListOfOrders.add(order);
    }

    public void removeOrder(int id){
        ListOfOrders.removeIf(order -> order.id() == id);
    }

    public void removeOrders(){
        ListOfOrders.clear();
    }

    public Order getOrderById(int id){
        for (Order order:ListOfOrders){
            if(order.id()==id){
                return order;
            }}
        return null;
    }

    public List<Order> getOrders(){
        return new ArrayList<>(ListOfOrders);
    }
}
