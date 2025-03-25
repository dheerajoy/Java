
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        /*
         * Array List
         * - Allows duplicates, fast access through indexes
         * - slower insertion/deletion than LinkedList
         */

        ArrayList<String> names = new ArrayList<>();

        names.add("partick");
        names.add("spongebod");

        System.out.println("first name : " + names.get(0));

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
