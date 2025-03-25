class Cars {
    String model;
    String colour;

    void drive() {
        System.out.println("You drive the " + this.colour + " " + this.model);
    }

    Cars(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }
}

public class Car {
    public static void main(String[] args) {
        Cars car1 = new Cars("civic", "red");
        Cars car2 = new Cars("urus", "white");

    }
}