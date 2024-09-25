package src;

public abstract class Book {
    protected int daysOverdue;
    protected int baseRent = 6;

    public Book(int daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public int getBaseRent() {
        return baseRent;
    }

    public abstract double calculateFine();
}






