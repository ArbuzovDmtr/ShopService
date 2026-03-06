import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {



    @Test

    void Should_addedNewOrder(){
        ProductRepo newRepOfProducts= new ProductRepo();
        OrderRepo newRepOfOrders= new OrderListRepo();
        ShopService shopService = new ShopService(newRepOfOrders,newRepOfProducts);

        Product product = new Product("TestProd",1.1,1);
        newRepOfProducts.addProduct(product);

        Map<Integer,Integer>MOfOrders =new HashMap<>();
        MOfOrders.put(1,2);
        shopService.newOrder(1,MOfOrders);

        assertEquals(1,newRepOfOrders.getOrders().size());

    }

    @Test

    void Shouldnt_addedNewOrder(){
        ProductRepo newRepOfProducts= new ProductRepo();
        OrderRepo newRepOfOrders= new OrderListRepo();
        ShopService shopService = new ShopService(newRepOfOrders,newRepOfProducts);

        Product product = new Product("TestProd",1.1,1);
        newRepOfProducts.addProduct(product);

        Map<Integer,Integer>MOfOrders =new HashMap<>();
        MOfOrders.put(4,2);
        shopService.newOrder(1,MOfOrders);

        assertTrue(newRepOfOrders.getOrders().isEmpty());

    }

}