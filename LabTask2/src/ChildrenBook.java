package src;

public class ChildrenBook extends Book {
    public ChildrenBook(int daysOverdue) {
        super(daysOverdue);
    }

    @Override
    public double calculateFine() {
        return FineCalculator.calculateChildrenFine(daysOverdue);
    }
}