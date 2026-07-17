package Day_4.class_task;
import java.util.Scanner;
class Multiply{
    public static void main(String[] args){
        int multiply=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            multiply = multiply*i;
            System.out.println(multiply);
        }
    }
}
