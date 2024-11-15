package LabTask1.src;

import java.time.Month;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Change this to the path of your CSV file
        String csvFile = "Goodreads.csv";
        List<Book> books = CSVReader.readBooksFromCSV(csvFile);
        
        BookListTracker tracker = new BookListTracker(books);
        
        // Total books read
        System.out.println("Total books read: " + tracker.getTotalBooksRead());
        
        // Books read per month
        Map<Month, Long> booksPerMonth = tracker.getBooksReadPerMonth();
        System.out.println("Books read per month:");
        for (Month month : booksPerMonth.keySet()) {
            System.out.println(month + ": " + booksPerMonth.get(month));
        }

        // Top 10 longest books
        System.out.println("Top 10 longest books:");
        List<Book> longestBooks = tracker.getTop10LongestBooks();
        for (Book book : longestBooks) {
            System.out.println(book.getTitle() + " (" + book.getPages() + " pages)");
        }

        // Genre frequency
        System.out.println("Genre frequency:");
        Map<String, Long> genreFrequency = tracker.getGenreFrequency();
        for (String genre : genreFrequency.keySet()) {
            System.out.println(genre + ": " + genreFrequency.get(genre));
        }

        // Average pages per book
        System.out.println("Average pages per book: " + tracker.getAveragePagesPerBook());
    }
}