package src;

public class NonFictionBook extends Book {
    public NonFictionBook(int daysOverdue) {
        super(daysOverdue);
    }

    @Override
    public double calculateFine() {
        return FineCalculator.calculateNonFictionFine(daysOverdue);
    }
}