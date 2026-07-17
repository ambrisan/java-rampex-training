package class_task;
import java.util.*;
public class hashmapmarksgrading {
    public static void main(String[] args) {
        Notification n1 =new Notification();
        n1.start();
        Notification n2 =new Notification();
        n2.start();
    }
}
class Notification extends Thread{
    public void run(){
        System.out.println("notifications.. "+Thread.currentThread().getName());
    }

}
