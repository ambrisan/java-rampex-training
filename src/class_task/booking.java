package class_task;
import java.util.*;
public class booking {
    public static void main(String[] args){
        bookTicket();
    }
    public static void bookTicket(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        if (age<18){
            System.out.println("throw new ArithmeticException()");

        }else{
            System.out.println("Enter how many tickets: ");
            int ticketnos=s.nextInt();
            System.out.println(ticketnos+ " printed.");
        }
        s.close();
    }
}
