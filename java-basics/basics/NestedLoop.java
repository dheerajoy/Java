
import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        // Nested Loops - A loop inside another loop, used often for matrices or DSA

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter No. of Rows : ");
        rows = scanner.nextInt();

        System.out.print("Enter No. of Columns : ");
        columns = scanner.nextInt();

        System.out.print("Enter Symbol : ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
