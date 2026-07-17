package Day_10.Class_Task;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.drive();
        System.out.print(c1);
    }
}
    //public static
    class Car {
        //Fields
        String brand ="bmw";
        String model ="m5";

        //Methods
        public void drive() {
            System.out.print("driving..");
        }
    }
