import java.util.Scanner;
public class TemperatureConvertor {
    public static void main(String[] args) {

        // Convert Temperature

        // Celsius To Fahrenheit = (9/5 * c) + 32;
        // Fahrenheit To  Celsius = 5/9 (f - 32);

        Scanner scanner = new Scanner(System.in);

        double temperature;
        String unit;
        double result;

        System.out.print("Enter the Temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert Temperature to Celsius or Fahrenheit (C or F) : ");
        unit = scanner.next().toUpperCase();

        result = (unit.equals("C")) ? 5/9 * (temperature - 32) : (9/5 * temperature) + 32 ;

        System.out.printf("%.2f °%s",result,unit); // alt + 0176
    
        scanner.close();
    }
}
