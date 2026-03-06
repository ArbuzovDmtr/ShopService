import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void Should_addProduct(){
        ProductRepo repo = new ProductRepo();
        Product product = new Product("testProd",1.1,1);
        repo.addProduct(product);
        assertTrue(repo.getListOfProducts().contains(product));
    }

    @Test
    void Should_removeProduct(){
        ProductRepo repo = new ProductRepo();
        Product product = new Product("testProd",1.1,1);
        repo.addProduct(product);
        repo.removeProduct(1);

        assertFalse(repo.getListOfProducts().contains(product));
    }


    @Test
    void Should_removeAllProducts(){
        ProductRepo repo = new ProductRepo();
        Product product = new Product("testProd",1.1,1);
        Product product2 = new Product("testProd1",2.2,2);
        repo.addProduct(product);
        repo.addProduct(product2);
        repo.removeProducts();

        assertTrue(repo.getListOfProducts().isEmpty());
    }


    @Test
    void Should_getProductById(){
        ProductRepo repo = new ProductRepo();
        Product product = new Product("testProd",1.1,1);
        Product product2 = new Product("testProd1",2.2,2);
        repo.addProduct(product);
        repo.addProduct(product2);

        assertEquals(product, repo.getProduct(1));
    }


}