/*
 *  Object - an entiry that holds data (attributes) and can perform actions (methods) 
 *           its a Reference data type 
 *           stored in a location heap
 */

class Car {
    String company = "ford";
    String model = "Mustang";
    int year = 1999;
    double price = 56000.823;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("YOu have started the engine");
    }

    void stop() {
        isRunning = false;
        System.out.println("car stopped");
    }

    void brake() {
        System.out.println("you have braked your " + model);
    }
}

/*
 * Constructor - A method to initialize a objects you can pass arguments to a
 * constructor
 * and set up initial values
 */

class Student {

    String name;
    int age;
    double gpa;
    boolean isRegistered;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isRegistered = true;
    }

    void studying() {
        System.out.println(this.name + " is Studying");
    }
}

/*
 * Overloaded Constructor - Allow a class to have multiple constructors with
 * different parameters list
 * Enables Object to be initialized in various ways
 */

class Users {
    String userName;
    String email;
    int age;

    Users() {
        this.userName = "GuestUser";
        this.email = "Not provided";
        this.age = 0;
    }

    Users(String userName) {
        this.userName = userName;
        this.email = "Not provided";
        this.age = 0;
    }

    Users(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.age = 0;
    }

    Users(String userName, String email, int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;
    }
}

/*
 * Object - an Entity that holds data (attributes) and can perform actions
 * (methods)
 * its a Reference data type
 * stored in a location heap
 */

public class Objects {
    public static void main(String[] args) {
        Car car = new Car();
        // System.out.println(car); // outputs memory address because of reference type\
        Student student1 = new Student("dheeraj", 23, 8.16);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isRegistered);
        student1.studying();

        Users user1 = new Users("Spongbob");
        Users user2 = new Users("patick", "pStart.yahoo.com", 23);
        Users user3 = new Users();

        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.userName);
        System.out.println(user2.age);
        System.out.println(user2.email);

        System.out.println(user3.userName);
        System.out.println(user3.age);
        System.out.println(user3.email);
    }
}
