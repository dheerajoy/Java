
import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

        // Enhanced Switch = A replacement to many else if statements
        // java 14 feature

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday" -> System.out.println("its a weekday");
            case "Tuesday" -> System.out.println("its a weekday");
            case "Wednesday" -> System.out.println("its a weekday");
            case "Thursday" -> System.out.println("its a weekday");
            case "Friday" -> System.out.println("its a weekday");
            case "Saturday" -> System.out.println("its a weekEND !!!!!!!!!!");
            case "Sunday" -> System.out.println("its a weekEND !!!!!!!!!!");
            default -> System.out.println(day + " is not a day");
        }

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("its a weekday");
            case "Saturday", "Sunday" -> System.out.println("its a weekEND !!!!!!!!!!");
            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }
}
