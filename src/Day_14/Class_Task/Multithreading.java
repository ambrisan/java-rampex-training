package Day_14.Class_Task;

public class Multithreading {
    public static void main(String [] args){

        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(new worker());
        t2.setName("Shree");

        System.out.println(t1.getName());

        t1.start();
        for(int i=0; i<100; i++){
            System.out.println("Main Thread Working: " + (char)i);
        }
    }
}

class MyThread extends Thread{

    @Override
    public void run(){
        for(int i=0; i<100; i++){

            System.out.println(Thread.currentThread().getName());
        }
    }
}
class worker extends Thread{
    public void run(){
        greet();
    }
    public static void greet(){
        System.out.println("Good Evening" + Thread.currentThread().getName());
    }
}