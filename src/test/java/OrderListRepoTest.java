import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderListRepoTest {

    @Test

    void Should_addOrder(){
        OrderListRepo newList = new OrderListRepo();
        Order newOrder = new Order(1, new HashMap<>());
        newList.addOrder(newOrder);
        assertEquals(newList.getOrderById(1), newOrder);
    }

    @Test

    void Should_removeOrder(){
        OrderListRepo newList = new OrderListRepo();
        Order newOrder = new Order(1, new HashMap<>());
        Order newOrder2 = new Order(2, new HashMap<>());
        newList.addOrder(newOrder);
        newList.addOrder(newOrder2);
        newList.removeOrder(1);
        assertFalse(newList.getListOfOrders().contains(newOrder));
    }

    @Test

    void Should_removeAllOrders(){
        OrderListRepo newList = new OrderListRepo();
        Order newOrder = new Order(1, new HashMap<>());
        Order newOrder2 = new Order(2, new HashMap<>());
        newList.addOrder(newOrder);
        newList.addOrder(newOrder2);
        newList.removeOrders();
        assertTrue(newList.getListOfOrders().isEmpty());
    }

    @Test

    void Should_getOrderById(){
        OrderListRepo newList = new OrderListRepo();
        Order newOrder = new Order(1, new HashMap<>());
        Order newOrder2 = new Order(2, new HashMap<>());
        newList.addOrder(newOrder);
        newList.addOrder(newOrder2);
        newList.getOrderById(1);
        assertEquals(newList.getOrderById(1),newOrder);
    }
    @Test

    void Should_getAllOrders(){

        Order newOrder = new Order(1, new HashMap<>());
        Order newOrder2 = new Order(2, new HashMap<>());
        List<Order> newList = new ArrayList<>();
        newList.add(newOrder);
        newList.add(newOrder2);
        OrderListRepo newRep = new OrderListRepo(newList);

        assertEquals(newRep.getOrders(),newList);
    }



}