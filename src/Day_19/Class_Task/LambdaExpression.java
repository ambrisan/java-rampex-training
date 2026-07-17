package Day_19.Class_Task;

interface flyable{
//    public void takeoff();
    public void fly();
}
public class LambdaExpression{
    public static void main(String [] args){
        flyable f = ()->{System.out.println("Flying");};
        f.fly();
//        Runnable r = ()->{System.out.println("New Thread Created" + Thread.currentThread());};
//        Thread t1 = new Thread(r);
//        Thread t1 = new Thread(()->{System.out.println("New Thread Created");});
//        t1.start();
//        Thread t2 = new Thread(()->{System.out.println("New Thread Created");});
//        t2.start();
    }
}
class A {
    public static void main(String [] args){

    }
}