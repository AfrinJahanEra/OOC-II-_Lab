package LabTask1.src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<Book> readBooksFromCSV(String fileName) {
        List<Book> books = new ArrayList<>();
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                // Assuming CSV format: title,author,genre,pages,finishDate
                String title = values[0];
                String author = values[1];
                String genre = values[2];
                int pages = Integer.parseInt(values[3]);
                String finishDate = values[4];
                
                books.add(new Book(title, author, genre, pages, finishDate));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}