package LabTask1;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        BookListAnalyzer analyzer = new BookListAnalyzer();

        try {
            analyzer.readBooks("Goodreads.csv");

            int totalBooksLastYear = analyzer.getTotalBooksReadLastYear();
            System.out.println("Total books read in the last year: " + totalBooksLastYear);

            double averageBookLength = analyzer.getAverageBookLength();
            System.out.println("Average book length: " + averageBookLength + " pages");

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
