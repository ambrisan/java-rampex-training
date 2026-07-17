package Day_2.class_task;
import java.util.Scanner;
class Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color:");
        String color = sc.nextLine();
        if (color.equals("Red")) {
            System.out.println("Stop");
        } else if (color.equals("Yellow")) {
            System.out.println("Wait");
        } else if (color.equals("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid Color");
        }
        sc.close();
    }
}

