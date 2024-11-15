package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRentalCalculatorTest {

    private BookRentalCalculator calculator;


    public void setUp() {
        calculator = new BookRentalCalculator();
    }

    @Test
    public void testFictionBookNoOverdue() {
        Book fictionBook = new FictionBook();
        LocalDate rentalDate = LocalDate.of(2023, 10, 1);
        LocalDate returnDate = LocalDate.of(2023, 10, 19); // Early return
        double rent = calculator.calculateRent(fictionBook, rentalDate, returnDate);
        assertEquals(4.8, rent); // 20% discount on $6
    }

    @Test
    public void testFictionBookWithOverdue() {
        Book fictionBook = new FictionBook();
        LocalDate rentalDate = LocalDate.of(2023, 10, 1);
        LocalDate returnDate = LocalDate.of(2023, 11, 1); // 11 days overdue
        double rent = calculator.calculateRent(fictionBook, rentalDate, returnDate);
        assertEquals(22.50, rent); // $6 rent + $1 base fine + $1.50 * 10 additional overdue days
    }

    @Test
    public void testNonFictionBookWithOverdue() {
        Book nonFictionBook = new NonFictionBook();
        LocalDate rentalDate = LocalDate.of(2023, 9, 1);
        LocalDate returnDate = LocalDate.of(2023, 10, 5); // 14 days overdue
        double rent = calculator.calculateRent(nonFictionBook, rentalDate, returnDate);
        assertEquals(45.0, rent); // $6 rent + $1.50 base fine + $2.50 * 13 additional overdue days
    }

    @Test
    public void testChildrenBookEarlyReturn() {
        Book childrenBook = new ChildrenBook();
        LocalDate rentalDate = LocalDate.of(2023, 10, 1);
        LocalDate returnDate = LocalDate.of(2023, 10, 15); // Early return (5 days before due)
        double rent = calculator.calculateRent(childrenBook, rentalDate, returnDate);
        assertEquals(4.8, rent); // 20% discount on $6
    }

    @Test
    public void testChildrenBookWithOverdue() {
        Book childrenBook = new ChildrenBook();
        LocalDate rentalDate = LocalDate.of(2023, 8, 1);
        LocalDate returnDate = LocalDate.of(2023, 8, 25); // 5 days overdue
        double rent = calculator.calculateRent(childrenBook, rentalDate, returnDate);
        assertEquals(9.0, rent); // $6 rent + $0.50 base fine + $0.75 * 4 additional overdue days
    }
}