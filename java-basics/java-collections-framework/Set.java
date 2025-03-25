
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        /*
         * HashSet
         * - Unique Element, No order
         */

        HashSet<Integer> number = new HashSet<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println(number); // order is not guarenteed
    }
}
