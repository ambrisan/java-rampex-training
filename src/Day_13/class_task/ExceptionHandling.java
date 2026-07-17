package Day_13.class_task;
import java.util.Scanner;
import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
//        int a = sc.nextInt();
        int a=0;
        try {
            //int a = sc.nextInt();
            a = sc.nextInt();
            System.out.println("Got the Input");

        }catch(InputMismatchException e){
                e.printStackTrace();
            }
            try {
                if (a > 10) {
                    throw new ArithmeticException();
                }
            }

            catch (Exception e) {
                e.printStackTrace();
            }
        System.out.println(a);
        System.out.println("Program Ended Successfully");
    }
}
