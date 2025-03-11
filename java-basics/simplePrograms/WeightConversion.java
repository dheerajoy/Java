import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        // Weight Conversion program

        int option;
        double weight;
        double result;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight Coversion Choose a option");
        System.out.println("Option 1: convert lbs to kgs");
        System.out.println("Option 2: convert kgs to lbs");
        System.out.print("Enter your option (1 or 2) : ");

        option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Enter lbs: ");
            weight = scanner.nextDouble();
            result = weight * 0.453592;
            System.out.printf("Result : %.2f Kgs" , result);

        }else if (option == 2) {
            System.out.print("Enter kgs: ");
            weight = scanner.nextDouble();
            result = weight * 2.2046;
            System.out.printf("Result : %.2f Lbs" , result);
        }else{
            System.out.println("Invalid option");
        }

        scanner.close();
    }
}
