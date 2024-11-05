package OnlineMarket.Info;

import OnlineMarket.Exceptions.InvalidValueException;

public class PricingInfo {
    private Float price;
    private Integer quantity;

    public PricingInfo(Float price, Integer quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(Float price) {
        if (price < 0) {
            throw new InvalidValueException("Price cannot be negative.");
        }
        this.price = price;
    }

    public Float getPrice() {
        return price;
    }

    public void setQuantity(Integer quantity) {
        if (quantity < 0) {
            throw new InvalidValueException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
