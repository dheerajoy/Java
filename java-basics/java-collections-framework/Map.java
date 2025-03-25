
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        /*
         * Map - Key - value pairs
         * 
         * HashMap - fast lookup, no order
         */

        HashMap<Integer, String> role = new HashMap<>();

        role.put(1, "admin");
        role.put(2, "sub-admin");

        System.out.println(role);
        System.out.println(role.keySet());
        System.out.println(role.get(1));

        for (Integer key : role.keySet()) {
            System.out.println("Key : " + key + ", value : " + role.get(key));
        }
    }
}
