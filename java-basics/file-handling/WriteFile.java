
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            FileWriter writter = new FileWriter("output.txt");
            String input;

            System.out.println("Type you content");
            input = scanner.nextLine();

            writter.write(input);
            scanner.close();
            writter.close();

            System.out.println("complete");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}