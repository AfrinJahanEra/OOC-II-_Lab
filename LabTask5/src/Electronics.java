public class Electronics extends Product{

    private double taxE= 0.15;

    Electronics(String name, int stockQuality, double unitPrice){
        super(name,stockQuality,unitPrice);
    }


    @Override
    public double calculateTotalPrice() {

        return (getUnitPrice()+(getUnitPrice()*taxE));
       
    }


    
}
