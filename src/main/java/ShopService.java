import java.util.*;

public class ShopService  {


    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    private int currentIdOrder=1;



    public ShopService(OrderRepo orderRepo,ProductRepo productRepo) {
        this.productRepo=productRepo;
        this.orderRepo = orderRepo;
    }


    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderListRepo=" + orderRepo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(productRepo, that.productRepo) && Objects.equals(orderRepo, that.orderRepo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productRepo, orderRepo);
    }


    public void newOrder( Map<Integer, Integer> MapOfProductsIdAndQuantity){
        Map<Product,Integer> MapOfProductsByOrder= new HashMap<>();
        for(int id:MapOfProductsIdAndQuantity.keySet()){
            Product product= productRepo.getProduct(id);
            if (product==null){
                System.out.println("Product with id "+id+" in this moment not available");
            }
            else {
                MapOfProductsByOrder.put(product,MapOfProductsIdAndQuantity.get(id));


            }
        }
        if(!MapOfProductsByOrder.isEmpty()){
            orderRepo.addOrder(new Order(currentIdOrder,MapOfProductsByOrder));
            System.out.println("Your Order ID is "+currentIdOrder);
            currentIdOrder++;

        }
        else{
            System.out.println("all Products are not available");
        }
    }


}
