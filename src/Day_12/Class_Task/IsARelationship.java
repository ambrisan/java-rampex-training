package Day_12.Class_Task;

public class IsARelationship {
    public static void main(String[] args) {

        Car c1 = new Car();
        //c1.start();
        c1.brand ="bmw";
        c1.model= "s1";
        c1.engine= new Engine();
    }
}
//Two method same method but it calls the parent(class) method is a polymorphish is called run type polymorphism
class Vehicle {
    public void Start() {
        System.out.println("Car Started...");
    }


    public void drive() {
        System.out.println("Vehicle driving...");
    }
}

    class Car extends Vehicle {
        String brand;
        String model;
        Engine engine;

        public void start() {
            engine.start(); //null.start();
        }
    }
        class Engine {
            public void start() {
                System.out.println("Engine Started");
            }
        }