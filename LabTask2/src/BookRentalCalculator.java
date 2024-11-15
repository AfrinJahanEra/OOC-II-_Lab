package src;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BookRentalCalculator {
    private static final int STANDARD_RENT_DAYS = 20;
    private static final double STANDARD_RENT_FEE = 6.0;
    private static final double EARLY_RETURN_DISCOUNT = 0.20;

    public double calculateRent(Book book, LocalDate rentalDate, LocalDate returnDate) {
        long daysRented = ChronoUnit.DAYS.between(rentalDate, returnDate);
        double totalRent = STANDARD_RENT_FEE;

        if (daysRented > STANDARD_RENT_DAYS) {
            totalRent += book.calculateFine(daysRented - STANDARD_RENT_DAYS);
        } else if (daysRented <= STANDARD_RENT_DAYS - 3) {
            // Apply early return discount if returned 3 days before due date
            totalRent -= totalRent * EARLY_RETURN_DISCOUNT;
        }

        return totalRent;
    }
}