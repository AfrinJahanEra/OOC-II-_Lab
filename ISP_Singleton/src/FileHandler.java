package ISP_Singleton.src;

import java.io.*;

public class FileHandler {
    private static FileHandler instance;

    private FileHandler() {
    
    }

    public static FileHandler getInstance() {
        if (instance == null) {
            instance = new FileHandler();
        }
        return instance;
    }

    public void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Reading: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void appendToFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(data);
            writer.newLine();
            System.out.println("Data appended to " + fileName + ": " + data);
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
    public void modifyFile(String fileName, String newData) {
        try {
            File tempFile = new File(fileName + ".tmp");
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

                String line;
                boolean modified = false;

                while ((line = reader.readLine()) != null) {
                
                    if (!modified) {
                        writer.write(newData); 
                        writer.newLine();
                        modified = true;  
                    } else {
                        writer.write(line);  
                        writer.newLine();
                    }
                }
                writer.close();

                
                File oldFile = new File(fileName);
                oldFile.delete();
                tempFile.renameTo(oldFile);
                System.out.println("File modified: " + fileName);
            }
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }


    public void renameFile(String oldFileName, String newFileName) {
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed to: " + newFileName);
        } else {
            System.out.println("Failed to rename file.");
        }
    }
}
