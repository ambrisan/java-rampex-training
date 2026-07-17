package class_task;
import java.util.*;
public class exceptionhandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=0;
        try {
            a = sc.nextInt();
            System.out.println(a * a);
            System.out.println("end");
        }
        catch(Exception e){}
        sc.close();
    }
}