package Test;

import src.FictionBook;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FictionBookOverdueFine {

    @Test
    public void testFictionBookOverdueFine() {
        FictionBook book = new FictionBook(10); 
        double actualFine = book.calculateFine();
        double expectedFine = 10.0;
        assertEquals(expectedFine, actualFine, 0.00);
    }
}
