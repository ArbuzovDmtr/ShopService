import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShopService {

    private ProductRepo productRepo;
    private OrderListRepo orderListRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    public ShopService() {
    }

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public OrderListRepo getOrderListRepo() {
        return orderListRepo;
    }

    public void setOrderListRepo(OrderListRepo orderListRepo) {
        this.orderListRepo = orderListRepo;
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderListRepo=" + orderListRepo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(productRepo, that.productRepo) && Objects.equals(orderListRepo, that.orderListRepo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productRepo, orderListRepo);
    }


    public void newOrder(int OrderId, List<Integer> listOfProductsId){
        List<Product> ListOfProductsByOrder= new ArrayList<>();
        for(int id:listOfProductsId){
            Product product= productRepo.getProduct(id);
            if (product==null){
                System.out.println("Product with id "+id+"not found");
            }
            else {
                ListOfProductsByOrder.add(product);

            }
        }
        if(!ListOfProductsByOrder.isEmpty()){
            orderListRepo.addOrder(new Order(OrderId,ListOfProductsByOrder));
        }
        else{
            System.out.println("all Products are not available");
        }
    }

}
