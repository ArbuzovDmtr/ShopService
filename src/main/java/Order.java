//import java.math.BigDecimal;

import java.util.Map;

public record Order(int id, Map <Product, Integer> products) {



    public double TotalSum(){
        double sum = 0;
        for (Map.Entry<Product,Integer> entry : products.entrySet()) {
            sum += entry.getKey().priceOfProduct() * entry.getValue();
        }
        return sum;
    }


}
