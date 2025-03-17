
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // While loop - Repeat some code forever while some condtion remains true

        // infinite loop
        // while (true) {
        // System.out.println("True");
        // }

        /*
         * String endGame = "";
         * 
         * while (!endGame.equals("Q")) {
         * System.out.print("Press any letter : ");
         * endGame = scanner.next().toUpperCase();
         * }
         * 
         * System.out.println("you pressed Q");
         */

        /*
         * int age;
         * 
         * System.out.print("Enter you age : ");
         * age = scanner.nextInt();
         * 
         * while (age < 0) {
         * System.out.println("age cannot be Negitive");
         * System.out.print("Enter you age : ");
         * age = scanner.nextInt();
         * }
         * 
         * System.out.println("you are " + age + " years old");
         * 
         *
         */

        // int number = 0;

        // while (number < 1 || number > 10) {
        // System.out.print("choose a number 1 - 10 : ");
        // number = scanner.nextInt();
        // }

        // do {
        // System.out.print("choose a number 1 - 10 : ");
        // number = scanner.nextInt();
        // } while (number <= 1 || number >= 10);

        // System.out.println("you picked " + number);

        int number = 1;
        while (number <= 3) {
            System.out.println("Number : " + number);
            number++;
        }

        scanner.close();
    }
}
