import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {


    private List<Product> ListOfProducts=new ArrayList<>();

    public ProductRepo(List<Product> listOfProducts) {
        ListOfProducts = listOfProducts;
    }

    public ProductRepo() {
    }

    public List<Product> getListOfProducts() {
        return ListOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        ListOfProducts = listOfProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(ListOfProducts, that.ListOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ListOfProducts);
    }
    public void addProduct(Product newProduct){
        ListOfProducts.add(newProduct);
    }
    public void removeProduct(int id){
        ListOfProducts.removeIf(product -> product.idOfProduct() == id);

    }

    public  void removeProducts(){
        ListOfProducts.clear();
    }
    public Product getProduct(int id){
        for (Product product:ListOfProducts){
            if(product.idOfProduct()==id){
                return product;
            }}
        return null;
    }

    public List<Product> getProducts(){
        return ListOfProducts;
    }
}
