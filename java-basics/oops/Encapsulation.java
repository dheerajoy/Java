/*
 * Encapsulation in Java (Data Hiding)
 * 
 * Encapsulation restricts direct access to object fields and allow modification only
 * through methods    
 */

class Person {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("dheeraj");
        System.out.println("Heelo, " + person1.getName());
    }
}
