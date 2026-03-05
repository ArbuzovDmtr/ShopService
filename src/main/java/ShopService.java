import java.util.*;

public class ShopService  {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;


    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public ShopService() {
    }



    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    public void setOrderListRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
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


    public void newOrder(int OrderId, Map<Integer, Integer> MapOfProductsIdAndQuantity){
        Map<Product,Integer> MapOfProductsByOrder= new HashMap<>();
        for(int id:MapOfProductsIdAndQuantity.keySet()){
            Product product= productRepo.getProduct(id);
            if (product==null){
                System.out.println("Product with id "+id+"not found");
            }
            else {
                MapOfProductsByOrder.put(product,MapOfProductsIdAndQuantity.get(id));

            }
        }
        if(!MapOfProductsByOrder.isEmpty()){
            orderRepo.addOrder(new Order(OrderId,MapOfProductsByOrder));
        }
        else{
            System.out.println("all Products are not available");
        }
    }


}
