package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.DiscountService;
import src.FictionBook;

public class EarlyReturnDiscount {
    @Test
    public void testEarlyReturnDiscount() {
        FictionBook book = new FictionBook(2); 
        double fineBeforeDiscount = book.calculateFine();
        double fineAfterDiscount = DiscountService.applyEarlyReturnDiscount(fineBeforeDiscount, 2);
        double expectedFineAfterDiscount = fineBeforeDiscount * 0.8; 
        assertEquals(expectedFineAfterDiscount, fineAfterDiscount, 0.01);
    }
}
