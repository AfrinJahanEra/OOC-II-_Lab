package src;

public class NonFictionBook implements Book {
    private static final double BASE_FINE = 1.50;
    private static final double ADDITIONAL_FINE = 2.50;

    @Override
    public double calculateFine(long overdueDays) {
        if (overdueDays <= 0) {
            return 0;
        }
        return BASE_FINE + (overdueDays - 1) * ADDITIONAL_FINE;
    }
}