
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        try {
            FileReader read = new FileReader("output.txt");
            Scanner scanner = new Scanner(read);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
