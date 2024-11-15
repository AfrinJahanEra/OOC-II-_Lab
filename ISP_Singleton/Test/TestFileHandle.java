package ISP_Singleton.Test;

import org.junit.jupiter.api.Test;

import ISP_Singleton.src.FileHandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TestFileHandler {

    @Test
    void testReadFile() {
        FileHandler fileHandler = FileHandler.getInstance();
        String fileName = "test.csv"; 

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Test data\nAnother test line.");
            writer.newLine();
        } catch (IOException e) {
            fail("Failed to write test data to file.");
        }

        fileHandler.readFile(fileName);

        new File(fileName).delete();
    }

    @Test
    void testModifyFile() {
        FileHandler fileHandler = FileHandler.getInstance();
        String fileName = "test.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Old Data");
        } catch (IOException e) {
            fail("Failed to write test data to file.");
        }

        fileHandler.modifyFile(fileName, "New Data");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            assertEquals("New Data", line, "File content should be updated after modification.");
        } catch (IOException e) {
            fail("Failed to read modified data from file.");
        }

        new File(fileName).delete();
    }
}

