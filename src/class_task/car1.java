package class_task;

public class car1 {
    public static void main(String[]a){
        car c1= new car();
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.colour);
        for(int i=0;i<=50;i++) {
            c1.accelerate();
            c1.accelerate();
            c1.brake();
        }
    }
}
class car {
    String brand="TATA";
    String model="CURUV";
    String colour="BLUE";
    int speed =0;
    int maxspeed=250;

    public void accelerate(){
        if(speed==250) {
            System.out.println("max speed is 250 km");
        }else {
            //System.out.println("driving ! !");
            speed = speed + 5;
            System.out.println("CAr is driving at: " + speed + " kms speed");
        }
    }
    public void brake() {
        if(0==speed) {
            System.out.println("brake is applied 0 kms ");
        }else{
            //System.out.println("driving ! !");
            speed = speed - 5;
            System.out.println("CAr is driving at: " + speed + " kms speed");
        }
    }
}
