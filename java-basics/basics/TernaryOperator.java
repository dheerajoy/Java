public class TernaryOperator {
    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if condtion is true
        // condition ? ifTrue : ifFalse

        int score = 24;
        String passOrFail = (score >= 25) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        int number = 50;
        String oddOrEven = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(oddOrEven);

        int age = 19;
        String eligible = (age > 18) ? "Can VOTE" : "Not eligible";
        System.out.println(eligible);

    }
}
