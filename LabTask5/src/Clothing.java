

public class Clothing extends Product {

    private double taxC = 0.10;

    Clothing(String name, int stockQuality, double unitPrice){
        super(name,stockQuality,unitPrice);
    }


    @Override
    public double calculateTotalPrice() {
        
         return (getUnitPrice()+(getUnitPrice()*taxC));
    }
    
}
