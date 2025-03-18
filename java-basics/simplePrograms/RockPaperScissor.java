/*
 *   ROCK PAPER SCISSOR GAME
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    // DECLARE CARIABLE
    // GET A CHOICE FROM USER
    // GET A RANDOM CHOICE FOR COMPUTER
    // CHECK WIN CONDTION
    // ASK TO PLAY AGAIN

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userInput;
        int computerInput;
        String[] options = { "1. ROCK", "2. PAPER", "3. SCISSORS" };
        boolean continueGame = true;

        while (continueGame) {
            computerInput = random.nextInt(1, 4);

            System.out.println("--------------------");
            System.out.println("ROCK PAPER SCISSORS");
            System.out.println("--------------------");

            for (String option : options) {
                System.out.println(option);
            }

            System.out.print("Pick any option (1 - 3) : ");
            userInput = scanner.nextInt();

            if (userInput <= 0 || userInput > 3) {
                System.out.println("************");
                System.out.println("Invalid Option");
                System.out.println("************");
            } else {
                System.out.println("Computer picked option : " + computerInput);

                if (userInput == computerInput) {
                    System.out.println("----");
                    System.out.println("TIE");
                    System.out.println("----");
                } else if (userInput == 1 && computerInput == 3 || userInput == 2 && computerInput == 3
                        || userInput == 3 && computerInput == 2) {
                    System.out.println("----");
                    System.out.println("WIN!!");
                    System.out.println("----");
                } else {
                    System.out.println("----");
                    System.out.println("LOSE");
                    System.out.println("----");

                }

                System.out.print("Press ENTER true/false to keep playing : ");
                continueGame = scanner.nextBoolean();
            }

        }
        scanner.close();

    }
}