package Day_19.Class_Task;

public class AnonymousClass {
    public void main(String[] args) {
//        Notification n1 = new Notification();
//        n1.start();
//        Notification n2 = new Notification();
//        n2.start();
        Notification n1 = new Notification();//Using Runnable Interface
//        Runnable r1 = new Runnable(){
//            public void run(){//this act as a main method for the Thread
//            }
//        };
        Runnable r1 = ()->{ };//new Runnable(){

            Thread t1 = new Thread();
        }
        Thread t1 = new Thread();
//        t1.start();
//        new Thread().start();
    }
class Notification {
    public void run() {
        System.out.println("Notification.." + Thread.currentThread());
    }
//    class Notification implements Runnable {
//        Runnable t1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("run Method called" + Thread.currentThread());
//                    Messaging m1 = new Messaging();
//                    m1.sendMessage();
//            }
//        };
    }
//            new Thread(t1).start();
//            t1.run();
