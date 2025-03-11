
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Simple Calculator

        Scanner scanner = new Scanner(System.in);

        double first;
        double second;
        double result = 0;
        char operation;
        boolean validOperator = true;

        System.out.print("Enter first number : ");
        first = scanner.nextDouble();

        System.out.print("Enter the operator ( + - % * / ) : ");
        operation = scanner.next().charAt(0);

        System.out.print("Enter second number : ");
        second = scanner.nextDouble();

        switch (operation) {
            case '+' -> result = first + second;
            case '-' -> result = first - second;
            case '*' -> result = first * second;
            case '/' -> {
                if (second == 0) {
                    System.out.println("Cannot divide by 0");
                    validOperator = false;
                } else {
                    result = first / second;
                }
            }
            case '%' -> result = first % second;
            default -> {
                System.out.println("Invalid Operation");
                validOperator = false;
            }
        }

        if (validOperator) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
