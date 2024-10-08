import java.time.LocalDate;
import java.util.ArrayList;

class BookAnalyzer {
    private ArrayList<Book> books;

    public BookAnalyzer(ArrayList<Book> books) {
        this.books = books;
    }

    public int getTotalBooksReadInLastYear() {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        int count = 0;
        for (Book book : books) {
            if (book.getParsedDateRead().isAfter(oneYearAgo)) {
                count++;
            }
        }
        return count;
    }

    
}