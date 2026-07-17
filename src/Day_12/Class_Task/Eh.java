package Day_12.Class_Task;
import java.util.Scanner;
public class Eh {
    public static void main(String[] args) {
        //int a=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        try {
            System.out.println("Program Started");
            //System.out.println(a+b);
            System.out.println(a / b);
            System.out.println("Program Ended");
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Handling the exception");
            System.out.println("don't divide by zero");
        }
    }
}
