import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
//creat file name table and  print length of the file and print multiplication of 5 its hsould print until 100 in the file and read the file and aafter perofrming these delete then file,before delete calculate the length again

// public class java {
//     public static void main(String[] args) {
//         try {
//             FileWriter fwrite = new FileWriter("C:/Users/91904/OneDrive/Desktop/COLLEGE/java/K22GBJAVA1.txt", true);

        
//             String lineToWrite = "A named location used to store related information on is referred to as a file";
//             int numberOfLines = 5;

//             for (int i = 0; i < numberOfLines; i++) {
//                 fwrite.write(lineToWrite + "\n");
//             }

//             fwrite.close();
//             System.out.println(numberOfLines + " lines successfully written to the file.");
//         } 
//         catch (IOException e) {
//             System.out.println("Unexpected error occurred");
//             e.printStackTrace();
//         }
//     }
// }
// public class java{
//     public static void main(String[] args){
//         File fo= new File("C:/Users/91904/OneDrive/Desktop/COLLEGE/java/K22GBJAVA.txt");
//         if(fo.delete()){
//             System.out.println(fo.getName()+" file is deleted succesfully");
//         }else{
//             System.out.println("Unexpected error found in deleteion of the file");
//         }
//     }
// }

import java.io.File;
import java.io.IOException;

public class FileLength {  

    public static void main(String[] args) {
        String filePath = "C:/Users/91904/OneDrive/Desktop/COLLEGE/java/TABLE.txt"; // Replace with your actual path
        File file = new File(filePath);

        try {
            int length = getLength(file);  // Call the getLength method
            System.out.println("File length: " + length + " bytes");
        } catch (IOException e) {
            System.out.println("Error getting file length: " + e.getMessage());
        }
    }

    public static int getLength(File file) throws IOException {
        if (file.exists()) {
            return (int) file.length();
        } else {
            throw new IOException("File not found: " + file.getPath());
        }
    }
}
