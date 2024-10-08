import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class TotalPriceTest {

    @Test
    public void testTotalPriceForElectronics() {
        Product product = ProductFactory.createProduct("electronics", "Laptop", 1, 2000);  
        double totalPrice = product.calculateTotalPrice();
        assertEquals(2300.0, totalPrice);
    }

   
    @Test
    public void testTotalPriceForClothing() {
        Product product = ProductFactory.createProduct("clothing", "Jacket", 2, 100);  
        double totalPrice = product.calculateTotalPrice();
        assertEquals(220.0, totalPrice);
    }


    @Test
    public void testTotalPriceForFurniture() {
        Product product = ProductFactory.createProduct("furniture", "Table", 1, 500); 
        double totalPrice = product.calculateTotalPrice();
        assertEquals(540.0, totalPrice);
    }

}
