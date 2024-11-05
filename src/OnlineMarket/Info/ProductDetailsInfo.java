package OnlineMarket.Info;

public class ProductDetailsInfo {
    private String description;
    private Boolean isAvailable;

    public ProductDetailsInfo(String description, Boolean isAvailable) {
        this.description = description;
        this.isAvailable = isAvailable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}