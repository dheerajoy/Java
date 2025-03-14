
// import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Random random = new Random();
        // int randomInt = random.nextInt(1, 11);
        // System.out.println(randomInt);

        double number = Math.floor(Math.random() * 10);
        double guess;
        int attempts = 1;

        System.out.println("Guess a Random Number 1-10");
        System.out.print("Enter a guess : ");
        guess = scanner.nextDouble();

        while (number != guess) {
            if (number < guess) {
                System.out.println("TOO high, try again");
            } else if (number > guess) {
                System.out.println("TOO low, try again");
            }
            System.out.print("Enter a guess : ");
            guess = scanner.nextDouble();
            attempts++;
        }

        System.out.println("YOU WON!!");
        System.out.println("Number of attempts : " + attempts);

        scanner.close();
    }
}
