
/*
 *  Custom Exception handling
 *  You can create custom exceptions using throw.
 */

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Under age below 18");
        }
        System.out.println("Valid Age");
    }

    public static void main(String[] args) {

        try {
            checkAge(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
