package Products;

public class Product {
    /**
     * Attributes
     */
    private String name;
    private double price;
    private String category;
    private String brand;
    private String unitType;
    private Availability status;
    private double discountPercentage;
    private int quantity;

    /**
     * Constructor
     */
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Availability getStatus() {
        return status;
    }

    public void setStatus(Availability status) {
        this.status = status;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
