/*
 * 
 * Polymorphism 
 * it means many forms, it allows methods to have the same name with different behaviours
 * 
 *          Method overloading (Compile-time) - same name, different parameters
 *          Method overiding (Run-time) - Override
 */

class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        Animal dog = new Dog();
        dog.makeSound();
        System.out.println(obj.add(10.5, 20.99));
    }
}
