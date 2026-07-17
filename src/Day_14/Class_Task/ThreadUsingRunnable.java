package Day_14.Class_Task;

public class ThreadUsingRunnable {
    public static void main(String [] args){
        Mythread mt = new Mythread();
        Thread t1 = new Thread(mt);
        t1.start();
        Thread t2 = new Thread(mt);
        t2.start();
        Thread t3 = new Thread(mt);
        t3.start();
//        t1.run();
    }
}
class Mythread implements Runnable{
    public void run(){
        System.out.println(" second Thread running " + Thread.currentThread().getName());
    }

}