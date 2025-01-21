import java.io.File;
import java.io.IOException;

public class CreateUniqueFile {

    public static void main(String[] args) {
        String baseFilename = "myfile";
        String fileExtension = ".txt"; 
        String path = "C:/Users/91904/OneDrive/Desktop/COLLEGE/java/";  

        int fileNumber = 1;  
        File newFile = new File(path, baseFilename + fileExtension);

        while (newFile.exists()) {
            
            newFile = new File(path, baseFilename + fileNumber + fileExtension);
            fileNumber++;
        }

        try {
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists with the same name.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}
