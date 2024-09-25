package LabTask1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BookListAnalyzer {
    private List<Book> books = new ArrayList<>();

    public void readBooks(String filename) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            String title = data[0].trim();
            String author = data[1].trim();
            String genre = data[2].trim();
            int pageCount = Integer.parseInt(data[3].trim());
            Date finishDate = sdf.parse(data[4].trim());
            books.add(new Book(title, author, genre, pageCount, finishDate));
        }
        reader.close();
    }

    public int getTotalBooksReadLastYear() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        Date oneYearAgo = cal.getTime();
        int count = 0;

        for (Book book : books) {
            if (book.getFinishDate().after(oneYearAgo)) {
                count++;
            }
        }
        return count;
    }

    public double getAverageBookLength() {
        int totalPages = 0;
        for (Book book : books) {
            totalPages += book.getPageCount();
        }
        return books.size() > 0 ? (double) totalPages / books.size() : 0;
    }
}
