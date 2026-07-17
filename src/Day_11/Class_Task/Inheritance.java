package Day_11.Class_Task;

public class Inheritance {
    //Inheritance = acquiring parents(superclass or parentclass) to a child(subclas) characters
    public static void main(String [] args){
        Car c1 = new Car();

        TataCar t1 = new TataCar();
        t1.start();
   
    }
}
class Car{
    String brand;
    String model;
    public void start(){

        System.out.println("car started");
    }

}
class TataCar extends Car {
    public void Start() {
        System.out.println("TataCar started...");
    }

    /*class Nexon extends TataCar {

    }*/

    class Nexon {
        public void start() {
            System.out.println("car started");
        }
    }

    class Ev {
        public void start() {
            System.out.println("Ev started");
        }
    }
}
