import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CharacterFileReader {
    public static void main(String[] args) {
        String filePath = "example.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("The file \"" + filePath + "\" does not exist.");
            return;
        }
        try {
            FileReader reader = new FileReader(file);
            int character;
            System.out.println("Contents of file: " + file.getName() + "\n");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
            System.out.println("\n\nEnd of file reached.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
    }
}