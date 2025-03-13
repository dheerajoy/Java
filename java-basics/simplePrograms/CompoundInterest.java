import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        // Compound Interest Calculator

        // CI = P * ( 1 + r/n ) ^ n * t

        double principal;
        double rate;
        int year;
        int timesCompounded;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal Amount : ");
        principal = scanner.nextDouble();

        System.out.print("Enter Rate of interest (in %) : ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter number of times Compunded per year : ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the years : ");
        year = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * year);

        System.out.printf("Compounded Amount is $%.2f after %d Year", amount, year);

        scanner.close();
    }
}
