/*
 * VarArgs - allows a method to accept a varying number of arguments
 *           makes a method more flexible, no need for overload methods
 *           Java will pack the arguments into an array
 *           ...(ellipsis)  
*/

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(avg(10, 20, 30, 40, 50));
        System.out.println(avg());
    }

    static int add(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    static double avg(double... numbers) {
        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
