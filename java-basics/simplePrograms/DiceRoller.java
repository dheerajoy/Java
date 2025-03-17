// Dice Roller Program

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // declare variable
        int total = 0;
        int numOfDice;

        // get # of dice from the user
        System.out.print("Enter # of dice to roll : ");
        numOfDice = scanner.nextInt();

        // check if # of dice is > 0
        // roll all the dice
        // get total
        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You Rolled : " + roll);
                total += roll;
            }
            System.out.println("Total is " + total);
        } else {
            System.out.println("No of dice should be more than 0");
            System.out.print("Enter # of dice : ");
            numOfDice = scanner.nextInt();
        }

        // display ASCII of dice

        scanner.close();
    }

    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   O   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                |O      |
                |       |
                |      O|
                 -------
                """;
        String dice3 = """
                 -------
                |O      |
                |   O   |
                |      O|
                 -------
                """;
        String dice4 = """
                 -------
                |O     O|
                |       |
                |O     O|
                 -------
                """;
        String dice5 = """
                 -------
                |O     O|
                |   O   |
                |O     O|
                 -------
                """;
        String dice6 = """
                 -------
                |O  O  O|
                |       |
                |O  O  O|
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("invalid");
        }

    }
}
