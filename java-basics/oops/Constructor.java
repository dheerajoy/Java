/*
 * constructor - A method to initialize a objects you can pass arguments to a constructor
 *               and set up initial values
 * 
 *   Default Constructor – No parameters.
 *   Parameterized Constructor – Accepts parameters
 */

class Vehicle {
    String name;
    int speed;

    Vehicle() {
        System.out.println("A new Vehicle is created");
    }

    Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void vehicleInfo() {
        System.out.println("A new vehcile was created - " + name);
        System.out.println("Speed of the Vehicle in Kmps - " + speed);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        Vehicle bike = new Vehicle("Kawaskai", 300);
        bike.vehicleInfo();
    }
}
