package Day_10.Class_Task;

public class CarTest {
    public static void main(String[] args) {
        //to test car object and create
        Car c1 = new Car();//first car created
        Car c2 = new Car();
      
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();
        c1.brake();
        c2.brand = "audi";
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
     
    }
}

    class Car {

        String brand = "bmw";
        String model = "m5";
        String color = "blue";
        int speed = 0;
        int maxspeed = 40;

        //methods
        public void drive() {
            System.out.print("Driving");
        }

        public void accelerate() {
            if (speed < maxspeed) {
                speed = speed + 10;
                System.out.println(brand + " is driving at: " + speed + "km");
            } else {
                System.out.println("Maximum Speed Reached " + maxspeed);
            }
        }

        public void brake() {
            speed = speed - 5;
            System.out.println(brand + " braken applied speed: " + speed + "kms");
            if (speed == 0) {
                System.out.print("vehicle is not moving");
            } else {
                speed = speed - 5;
                System.out.println(brand + " braken applied speed: " + speed + "kms");
            }
        }
    }
