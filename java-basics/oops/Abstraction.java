/*
 * 
 * Abstarction means hiding details, showing only important features
 */

abstract class janwar {
    abstract void makeSound();
}

class bili extends janwar {
    void makeSound() {
        System.out.println("meow meow");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        bili cat = new bili();
        cat.makeSound();
    }
}
