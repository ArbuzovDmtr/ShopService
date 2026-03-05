import java.math.BigDecimal;

import java.util.Map;

public record Order(int id, Map <Product, Integer> products) {

    public BigDecimal TotalSum(){
        BigDecimal Sum = new BigDecimal(0);
        for(Product product:products.keySet()){
            Sum=Sum.add(product.priceOfProduct().multiply(new BigDecimal(products.get(product))));

        }
        return Sum;
    }


}
