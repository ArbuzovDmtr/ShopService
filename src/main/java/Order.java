//import java.math.BigDecimal;

import java.util.Map;

public record Order(int id, Map <Product, Integer> products) {

    public double TotalSum(){
        double Sum = 0;
        for(Product product:products.keySet()){
            Sum+=product.priceOfProduct()*(products.get(product));

        }
        return Sum;
    }


}
