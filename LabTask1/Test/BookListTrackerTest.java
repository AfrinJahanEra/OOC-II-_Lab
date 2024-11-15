package LabTask1.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.util.*;
import LabTask1.src.*;

import static org.junit.jupiter.api.Assertions.*;

public class BookListTrackerTest {

    private BookListTracker tracker;

    @BeforeEach
    public void setup() {
        // Initializing the list with the example data
        List<Book> books = Arrays.asList(
            new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 180, "2023-01-05"),
            new Book("Atomic Habits", "James Clear", "Self-Help", 320, "2023-02-14"),
            new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 310, "2023-03-01"),
            new Book("Sapiens", "Yuval Noah Harari", "Non-Fiction", 498, "2023-04-10"),
            new Book("Pride and Prejudice", "Jane Austen", "Classic", 279, "2023-04-25"),
            new Book("Dune", "Frank Herbert", "Sci-Fi", 412, "2023-05-18"),
            new Book("Educated", "Tara Westover", "Memoir", 334, "2023-06-12")
        );
        tracker = new BookListTracker(books);
    }

    // Test for the total number of books read
    @Test
    public void testTotalBooksRead() {
        assertEquals(7, tracker.getTotalBooksRead());
    }

    // Test for books read per month
    @Test
    public void testBooksReadPerMonth() {
        Map<Month, Long> booksPerMonth = tracker.getBooksReadPerMonth();
        
        // Checking if January has 1 book
        assertEquals(1, booksPerMonth.get(Month.JANUARY));
        
        // Checking if February has 1 book
        assertEquals(1, booksPerMonth.get(Month.FEBRUARY));

        // Checking if March has 1 book
        assertEquals(1, booksPerMonth.get(Month.MARCH));

        // Checking if April has 2 books
        assertEquals(2, booksPerMonth.get(Month.APRIL));

        // Checking if May has 1 book
        assertEquals(1, booksPerMonth.get(Month.MAY));

        // Checking if June has 1 book
        assertEquals(1, booksPerMonth.get(Month.JUNE));
    }

    // Test for top 10 longest books
    @Test
    public void testTop10LongestBooks() {
        List<Book> longestBooks = tracker.getTop10LongestBooks();

        // Check if the longest book is "Sapiens" with 498 pages
        assertEquals("Sapiens", longestBooks.get(0).getTitle());
        assertEquals(498, longestBooks.get(0).getPages());

        // Check if the second longest book is "Dune" with 412 pages
        assertEquals("Dune", longestBooks.get(1).getTitle());
        assertEquals(412, longestBooks.get(1).getPages());

        // Check if the third longest book is "Educated" with 334 pages
        assertEquals("Educated", longestBooks.get(2).getTitle());
        assertEquals(334, longestBooks.get(2).getPages());

        // Check if the fourth longest book is "Atomic Habits" with 320 pages
        assertEquals("Atomic Habits", longestBooks.get(3).getTitle());
        assertEquals(320, longestBooks.get(3).getPages());

        // Check if the fifth longest book is "The Hobbit" with 310 pages
        assertEquals("The Hobbit", longestBooks.get(4).getTitle());
        assertEquals(310, longestBooks.get(4).getPages());

        // Check if the sixth longest book is "Pride and Prejudice" with 279 pages
        assertEquals("Pride and Prejudice", longestBooks.get(5).getTitle());
        assertEquals(279, longestBooks.get(5).getPages());

        // Check if the seventh longest book is "The Great Gatsby" with 180 pages
        assertEquals("The Great Gatsby", longestBooks.get(6).getTitle());
        assertEquals(180, longestBooks.get(6).getPages());

        // Since we only have 7 books, the length of the list should be 7
        assertEquals(7, longestBooks.size());
    }

    // Test for genre frequency
    @Test
    public void testGenreFrequency() {
        Map<String, Long> genreFrequency = tracker.getGenreFrequency();

        // Check the number of "Classic" books
        assertEquals(2, genreFrequency.get("Classic"));

        // Check the number of "Self-Help" books
        assertEquals(1, genreFrequency.get("Self-Help"));

        // Check the number of "Fantasy" books
        assertEquals(1, genreFrequency.get("Fantasy"));

        // Check the number of "Non-Fiction" books
        assertEquals(1, genreFrequency.get("Non-Fiction"));

        // Check the number of "Sci-Fi" books
        assertEquals(1, genreFrequency.get("Sci-Fi"));

        // Check the number of "Memoir" books
        assertEquals(1, genreFrequency.get("Memoir"));
    }

    // Test for average pages per book
    @Test
    public void testAveragePagesPerBook() {
        double averagePages = tracker.getAveragePagesPerBook();

        // Expected average is calculated as (180 + 320 + 310 + 498 + 279 + 412 + 334) / 7 = 333.29
        assertEquals(333.29, averagePages, 0.01); // Allowing for a small precision error
    }
}