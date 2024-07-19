import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String text = "Computer Science and Engineering";
        String filePath = "example.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("Text written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        try (FileReader reader = new FileReader(filePath)) {
            int character;
            StringBuilder content = new StringBuilder();
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println("Text read from file: " + content.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
