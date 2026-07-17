package Day_14.Home_Task;

// Define the Flyable interface
interface Flyable {
    void fly();
}

// Bird class implementing Flyable
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flapping wings");
    }
}

// Airplane class implementing Flyable
class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is engaging engines");
    }
}

// Main class to demonstrate polymorphism
public class FlyableDemo {
    public static void main(String[] args) {
        // Demonstrate polymorphism using a Flyable array
        Flyable[] flyers = new Flyable[] {
                new Bird(),
                new Airplane()
        };

        // Iterate and call the fly method on each object
        for (Flyable flyer : flyers) {
            flyer.fly();
        }
    }
}