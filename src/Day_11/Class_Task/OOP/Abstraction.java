package Day_11.Class_Task.OOP;

public class Abstraction {
    //Telling what to do, not how to do
    public static void main(String [] args){
        iphone p1 =new iphone();
        p1.call();
        p1.message();
        p1.takePhoto();

    }
}

abstract class phone {
    public abstract void call();

    public abstract void message();

    public abstract void takePhoto();
}

    class iphone extends phone {
        public void call() {
            System.out.println("Calling from iPhone");
        }

        public void message() {
            System.out.println("Messaging from iPhone");
        }

        public void takePhoto() {
            System.out.println("Photo captured");
        }
    }
