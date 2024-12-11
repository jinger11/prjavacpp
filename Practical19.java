/*19. Write a Java program that reads a file and throws an exception if the file is empty.
*/
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

// Custom exception class to handle empty file scenario
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class Practical19 {

    // Method to read the file and throw exception if it's empty
    public static void readFile(String filePath) throws EmptyFileException {
        try {
            // Read all lines from the file
            File file = new File(filePath);

            // Check if the file exists
            if (!file.exists()) {
                System.out.println("File not found!");
                return;
            }

            // Read the content of the file
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Check if the content is empty
            if (content.trim().isEmpty()) {
                throw new EmptyFileException("The file is empty!");
            } else {
                System.out.println("File content:");
                System.out.println(content);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Specify the file path (change this path to an existing file in your system)
        String filePath = "test.txt"; // Change this to the path of the file you want to read

        try {
            // Call the method to read the file
            readFile(filePath);
        } catch (EmptyFileException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
