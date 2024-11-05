package OnlineMarket.Products;



import OnlineMarket.Attributes.Size;
import OnlineMarket.Enums.Category;
import OnlineMarket.Info.PricingInfo;
import OnlineMarket.Info.ProductBasicInfo;
import OnlineMarket.Info.ProductDetailsInfo;

import java.time.LocalDateTime;

public class FoodProduct extends Product {
    private final String brand;
    private final LocalDateTime expirationDate;
    private final Boolean isOrganic;
    private final Category category = Category.FOOD;

    private FoodProduct(Builder builder) {
        super(builder.id, builder.basicInfo, builder.pricingInfo, builder.size, builder.productDetails);
        this.brand = builder.brand;
        this.expirationDate = builder.expirationDate;
        this.isOrganic = builder.isOrganic;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public Boolean getIsOrganic() {
        return isOrganic;
    }

    public static class Builder {
        private final int id;
        private final ProductBasicInfo basicInfo;
        private final PricingInfo pricingInfo;
        private final Size size;
        private final ProductDetailsInfo productDetails;
        private String brand;
        private LocalDateTime expirationDate;
        private Boolean isOrganic;

        public Builder(int id, ProductBasicInfo basicInfo, PricingInfo pricingInfo, Size size, ProductDetailsInfo productDetails) {
            this.id = id;
            this.basicInfo = basicInfo;
            this.pricingInfo = pricingInfo;
            this.size = size;
            this.productDetails = productDetails;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder expirationDate(LocalDateTime expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder isOrganic(Boolean isOrganic) {
            this.isOrganic = isOrganic;
            return this;
        }

        public FoodProduct build() {
            return new FoodProduct(this);
        }
    }
}

