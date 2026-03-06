import java.util.HashMap;
import java.util.Map;

public class Main {

    static void main() {


        OrderRepo newList = new OrderListRepo();




        ProductRepo newRepOfProducts = new ProductRepo();
        newRepOfProducts.addProduct(new Product("cucumber",4.2,1));
        newRepOfProducts.addProduct(new Product("tomato",6.13,2));
        newRepOfProducts.addProduct(new Product("paprika",3.22,3));
        newRepOfProducts.addProduct(new Product("cheese",9.99,4));
        newRepOfProducts.addProduct(new Product("bacon",5.89,5));



        ShopService shop = new ShopService(newList, newRepOfProducts);


        Map<Integer, Integer> MapOfCurrentOrder = new HashMap<>();
        MapOfCurrentOrder.put(1,7);
        MapOfCurrentOrder.put(7,6);
        MapOfCurrentOrder.put(4,12);

        shop.newOrder(1,MapOfCurrentOrder);
        System.out.println(shop.getOrderRepo());
        System.out.println(shop.getOrderRepo().getOrderById(1).TotalSum());



    }}
