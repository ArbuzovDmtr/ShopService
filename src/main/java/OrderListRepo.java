import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo implements OrderRepo {

private  final List<Order> ListOfOrders= new ArrayList<>();



    public OrderListRepo() {
    }
    public List<Order> getListOfOrders() {
        return new ArrayList<>(ListOfOrders);
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
                "ListOfOrders=" + '\n'+ListOfOrders +
                '}'+'\n';
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

