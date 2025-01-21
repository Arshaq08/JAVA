import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String fileName = "C:/Users/91904/OneDrive/Desktop/COLLEGE/java/K22GBJAVA.txt";

        // Create the File object
        File file = new File(fileName);

        try {
            // Attempt to create the file
            if (file.createNewFile()) {
                System.out.println("File: " + file.getName() + " is created successfully");
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
                System.out.println("Is file writable: " + file.canWrite());
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
