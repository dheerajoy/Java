import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // for loop - execute some code for a CERTAIN amount of times

        // for ( initilization; condition; incermental )

        // for (int i = 1; i <= 10; i += 2) {
        // System.out.println(i);
        // }

        // for (int i = 10; i > 0; i--) {
        // System.out.println(i);
        // }

        /*
         * TABLES PROGRAM
         * 
         * 
         * int number;
         * 
         * System.out.print("from 1 till where do you want tables : ");
         * number = scanner.nextInt();
         * for (int i = 1; i <= number; i++) {
         * for (int j = 1; j <= 10; j++) {
         * System.out.println(i + " x " + j + " = " + i * j);
         * }
         * System.out.println("------");
         * }
         */

        int seconds;
        String message;

        System.out.print("Enter Message : ");
        message = scanner.nextLine();

        System.out.print("Enter coundown seconds :");
        seconds = scanner.nextInt();

        for (int i = seconds; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println(message);

        scanner.close();
    }
}
