import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            // Parse the JSON file
            Object obj = parser.parse(new FileReader("Book.json"));

            // Since the JSON starts with an array, cast it to a JSONArray
            JSONArray bookArray = (JSONArray) obj;

            // Iterate through the array of books
            for (Object bookObj : bookArray) {
                JSONObject book = (JSONObject) bookObj;

                // Extract book details
                String title = (String) book.get("title");
                String author = (String) book.get("author");
                String genre = (String) book.get("genre");
                long pages = (Long) book.get("pages");  // Cast pages as Long (since JSON number is treated as long in simple JSON)
                String dateRead = (String) book.get("date_read");

                // Print out the book details
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Genre: " + genre);
                System.out.println("Pages: " + pages);
                System.out.println("Date Read: " + dateRead);
                System.out.println("-------------------");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
