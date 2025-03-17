
import java.util.Scanner;

public class BankingProject {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Java banking program

        // declare variable
        // display menu
        // get and process user choice
        // showBalance()
        // deposit()
        // withDraw()
        // EXIT message

        int process;
        double amount;
        double balance = 100;

        System.out.println("*****************");
        System.out.println("***  WELCOME  ***");
        System.out.println("*****************");

        do {
            System.out.println("1 : Show Balance");
            System.out.println("2 : Deposit");
            System.out.println("3 : Withdraw");
            System.out.println("4 : Exit");
            System.out.print("Enter yout choice (1-4) : ");
            process = scanner.nextInt();

        } while (process < 0 || process > 4);

        switch (process) {
            case 1 ->
                showBalance(balance);
            case 2 -> {
                System.out.print("Enter the Deposit Amount : ");
                amount = scanner.nextDouble();
                balance = deposit(balance, amount);
                showBalance(balance);
            }
            case 3 -> {
                System.out.print("Enter the Withdraw Ammount : ");
                amount = scanner.nextDouble();
                balance = withDraw(balance, amount);
                showBalance(balance);
            }
            case 4 -> {
                System.out.println("You choose to EXIT");
            }
            default -> System.out.println("Invalid option");
        }

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Balance : $%.2f \n", balance);
    }

    static double deposit(double balance, double depositAmount) {
        return balance += depositAmount;
    }

    static double withDraw(double balance, double withdrawAmount) {
        return balance -= withdrawAmount;
    }
}
