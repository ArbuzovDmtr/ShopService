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
    public void deleteProduct(int id){
        ListOfProducts.removeIf(product -> product.idOfProduct() == id);

    }

    public  void deleteAllProducts(){
        ListOfProducts.clear();
    }
    public Product returnProduct(int id){
        for (Product product:ListOfProducts){
            if(product.idOfProduct()==id){
                return product;
            }}
        return null;
    }

    public List<Product> returnAllProducts(){
        return ListOfProducts;
    }
}
