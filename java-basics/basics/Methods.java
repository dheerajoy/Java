public class Methods {

    public static void main(String[] args) {
        // Methods - a block of Reusable code, that is executed when called ()

        // happyBirthDay("DHeeraj", 23);

        System.out.println(square(10));
        System.out.println(qude(3));

        String fullName = getFullName("Dheeraj", "kumar");
        System.out.println(fullName);

        System.out.println(validate(19));
    }

    static void happyBirthDay(String name, int age) {
        System.out.println("Happy Birthday to you " + name);
        System.out.println("May Good Bless you");
        System.out.println("Happy Birthday to you " + name);
        System.out.printf("You are %d years old!!", age);
        System.out.println();
    }

    static double square(double num) {
        return num * num;
    }

    static double qude(double num) {
        return num * num * num;
    }

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static String validate(int age) {
        return (age > 18) ? "you may sign-up" : "must be 18+ to sign-up";
    }
}
