
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        // declare variable
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payOut;
        String[] row;

        // display welcome message
        System.out.println("------------------------");
        System.out.println("Welcome to Slot machine");
        System.out.println("Symbols : 🍉 🍒 🔔 ⭐ 🍋");
        System.out.println("-------------------------");

        // play if balance > 0
        while (balance > 0) {
            // enter the bet
            System.out.println("current balance : $" + balance);
            System.out.print("Place your bet amount : ");
            bet = scanner.nextInt();

            // verify if bet > balance
            // verfiy if bet > 0
            if (bet > balance) {
                System.out.println("Insufficient Funds!!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
            } else {
                // subtact bet from balance
                balance -= bet;
            }

            System.out.println("Spinning...");
            // spin row
            row = spinRow();
            // print row
            printRow(row);
            // get payout
            payOut = getPayout(row, bet);
            // continue message
            if (payOut > 0) {
                System.out.println("You have won : $" + payOut);
                balance += payOut;
            } else {
                System.out.println("Sorry you lost this round");
            }
        }

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = { "🍉", "🍒", "🔔", "⭐", "🍋" };
        String[] row = new String[3];

        Random random = new Random();

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("--------------");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("--------------");
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍋" -> bet * 3;
                case "⭐" -> bet * 5;
                case "🔔" -> bet * 6;
                case "🍉" -> bet * 10;
                case "🍒" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍋" -> bet * 2;
                case "⭐" -> bet * 3;
                case "🔔" -> bet * 4;
                case "🍉" -> bet * 8;
                case "🍒" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍋" -> bet * 2;
                case "⭐" -> bet * 3;
                case "🔔" -> bet * 4;
                case "🍉" -> bet * 8;
                case "🍒" -> bet * 10;
                default -> 0;
            };
        } else {
            return 0;
        }

    }
}
