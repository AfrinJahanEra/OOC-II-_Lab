import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVFile {
    public static void main(String[] args) {
        try {
        
            File file = new File("Book.csv");            
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                
                String line = sc.nextLine();

                String[] values = line.split(",");

                System.out.println("Title: " + values[0]);
                System.out.println("Author: " + values[1]);
                System.out.println("Genre: " + values[2]);
                System.out.println("Pages: " + values[3]);
                System.out.println("Date Read: " + values[4]);
                System.out.println("                ");
            }

             sc.close();
             
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
