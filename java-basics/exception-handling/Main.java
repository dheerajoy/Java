
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 1;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by 0");
        }
    }
}
