public class Furniture extends Product{

    private double taxF = 0.5;

    Furniture(String name, int stockQuality, double unitPrice){
        super(name,stockQuality,unitPrice);
    }

    @Override
    public double calculateTotalPrice() {
        
        return (getUnitPrice()+(getUnitPrice()*taxF));
    }
    
}
