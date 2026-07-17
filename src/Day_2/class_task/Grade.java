package Day_2.class_task;
import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 91 && a < 100) {
            System.out.print("A grade");
        } else if (a > 81 && a < 90) {
            System.out.print("B grade");
        } else if (a > 65 && a < 80) {
            System.out.print("C grade");
        } else {
            System.out.print("Fail");
        }
    }
}