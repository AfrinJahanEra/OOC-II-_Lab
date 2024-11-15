package LabTask1.src;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookListTracker {
    private List<Book> books;

    public BookListTracker(List<Book> books) {
        this.books = books;
    }

    public int getTotalBooksRead() {
        return books.size();
    }

    public Map<Month, Long> getBooksReadPerMonth() {
        Map<Month, Long> booksPerMonth = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        for (Book book : books) {
            LocalDate finishDate = LocalDate.parse(book.getFinishDate(), formatter);
            Month month = finishDate.getMonth();
            booksPerMonth.put(month, booksPerMonth.getOrDefault(month, 0L) + 1);
        }
        return booksPerMonth;
    }

    public List<Book> getTop10LongestBooks() {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort((b1, b2) -> Integer.compare(b2.getPages(), b1.getPages()));
        return sortedBooks.subList(0, Math.min(10, sortedBooks.size()));
    }

    public Map<String, Long> getGenreFrequency() {
        Map<String, Long> genreFrequency = new HashMap<>();
        
        for (Book book : books) {
            genreFrequency.put(book.getGenre(), genreFrequency.getOrDefault(book.getGenre(), 0L) + 1);
        }
        return genreFrequency;
    }

    public double getAveragePagesPerBook() {
        int totalPages = books.stream().mapToInt(Book::getPages).sum();
        return totalPages / (double) books.size();
    }
}