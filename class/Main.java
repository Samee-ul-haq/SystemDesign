class Car {
    // Attributes
    private String brand;
    private String model;
    private int speed;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    // Method to accelerate
    public void accelerate(int increment) {
        speed += increment;
    }

    // Method to display info
    public void displayStatus() {
        System.out.println(brand + " is running at " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car corolla = new Car("Toyota", "Corolla");
        Car mustang = new Car("Ford", "Mustang");

        corolla.accelerate(20);
        mustang.accelerate(40);

        // Displaying status of each car
        corolla.displayStatus();
        System.out.println("-----------------");
        mustang.displayStatus();
    }
}