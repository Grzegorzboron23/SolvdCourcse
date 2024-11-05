package OnlineMarket.Service;

import OnlineMarket.Products.Product;

import java.util.List;

public class ProductService {
    public static <T extends Product> float countTotalValue(List<T> products) {
        float totalValue = 0;
        for (T product : products) {
            totalValue += product.getPricingInfo().getPrice() * product.getPricingInfo().getQuantity();
        }
        return totalValue;
    }

}
