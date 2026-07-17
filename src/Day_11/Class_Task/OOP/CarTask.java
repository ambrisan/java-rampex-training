package Day_11.Class_Task.OOP;
import java.util.SortedMap;
public class CarTask {
    public static void main(String [] args) {
        Car c1 = new Car("audi","m1");

    }

    static class Car {
        String brand;
        String model;

        Car(){
            System.out.println("Construct a Car");
        }
        Car(String Cbrand, String Cmodel){
   
            brand = Cbrand;
            model = Cmodel;
            System.out.println("Second Constructed a Car");
        }
    }
}
