import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVExample {
    public static void main(String[] args) {
        try {
            // Specify the path to your CSV file
            File file = new File("Book.csv");

            // Create a Scanner object to read the file
            Scanner sc = new Scanner(file);

            // Loop through each line in the CSV file
            while (sc.hasNextLine()) {
                // Read the entire line
                String line = sc.nextLine();

                // Split the line by commas to get individual values
                String[] values = line.split(",");

                // Process the data (Here, just printing the values)
                System.out.println("Title: " + values[0]);
                System.out.println("Author: " + values[1]);
                System.out.println("Genre: " + values[2]);
                System.out.println("Pages: " + values[3]);
                System.out.println("Date Read: " + values[4]);
                System.out.println("----------------------------");
            }

            // Close the Scanner object
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
