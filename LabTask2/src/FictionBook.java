package src;

public class FictionBook extends Book {
    public FictionBook(int daysOverdue) {
        super(daysOverdue);
    }

    @Override
    public double calculateFine() {
        return FineCalculator.calculateFictionFine(daysOverdue);
    }
}