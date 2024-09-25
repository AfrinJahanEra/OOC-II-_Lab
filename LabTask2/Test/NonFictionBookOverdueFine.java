package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.NonFictionBook;

public class NonFictionBookOverdueFine {
    @Test
    public void testNonFictionBookOverdueFine() {
        NonFictionBook book = new NonFictionBook(15); 
        double actualFine = book.calculateFine();
        double expectedFine = 27.5;
        assertEquals(expectedFine, actualFine, 0.00);
    }
}
