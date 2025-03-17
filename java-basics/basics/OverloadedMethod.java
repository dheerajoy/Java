public class OverloadedMethod {
    public static void main(String[] args) {

        /*
         * Overloaded methods - Methods that share the same name but different
         * parameters
         * 
         * signature = method name + method parameter
         */

        System.out.println(add(2, 4, 4));
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
