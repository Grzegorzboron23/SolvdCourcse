package OnlineMarket.Products;

import OnlineMarket.Attributes.Size;
import OnlineMarket.Info.PricingInfo;
import OnlineMarket.Info.ProductBasicInfo;
import OnlineMarket.Info.ProductDetailsInfo;

public abstract class Product {
    private final int id;
    private ProductBasicInfo basicInfo;
    private PricingInfo pricingInfo;
    private Size size;
    private ProductDetailsInfo productDetails;

    public Product(int id, ProductBasicInfo basicInfo, PricingInfo pricingInfo, Size size, ProductDetailsInfo productDetails) {
        this.id = id;
        this.basicInfo = basicInfo;
        this.pricingInfo = pricingInfo;
        this.size = size;
        this.productDetails = productDetails;
    }

    public ProductBasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(ProductBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public PricingInfo getPricingInfo() {
        return pricingInfo;
    }

    public void setPricingInfo(PricingInfo pricingInfo) {
        this.pricingInfo = pricingInfo;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public ProductDetailsInfo getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetailsInfo productDetails) {
        this.productDetails = productDetails;
    }
}
