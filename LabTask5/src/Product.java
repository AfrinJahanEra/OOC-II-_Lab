abstract class Product{
    private String name;
    private int stockQuality;
    private double unitPrice;

    Product(String name, int stockQuality, double unitPrice){
        this.name=name;
        this.stockQuality=stockQuality;
        this.unitPrice=unitPrice;
    }
    public String getName() {
        return name;
    }
    public int getStockQuantity() {
        return stockQuality;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public abstract double calculateTotalPrice();
}