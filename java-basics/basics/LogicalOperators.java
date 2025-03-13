import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // && - and
        // || - or
        // ! - not

        double temp = -20;
        boolean isSunny = false;

        if (temp >= 36 && temp >= 0 && isSunny) {
            System.out.println("it is HOT outside!!");
            System.out.println("Sunny today!");
        } else if (temp <= 36 && temp >= 0 && !isSunny) {
            System.out.println("it is HOT outside!!");
            System.out.println("cloudy today!");
        } else if (temp > 30 || temp < 0) {
            System.out.println("Bad Weather outside");
        }

        // username must be between 4=12 characters
        // username must not contain any spaces or underscore

        String userName;

        System.out.print("Enter your UserName : ");
        userName = scanner.nextLine();

        if (userName.contains(" ") || userName.contains("_")) {
            System.out.println("UserName Must not contain space or underscore");
        } else if (userName.length() < 4 || userName.length() > 12) {
            System.out.println("UserName must have 4 to 12 characters");
        } else {
            System.out.println("welcome " + userName);
        }

        scanner.close();

    }
}
