package Day_7.home_task;
import java.util.Scanner;

public class Hallow_Square_Astrek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the square: ");
        int n = scanner.nextInt(); // Size of the square

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' for the border and ' ' for the inside
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            scanner.close();
        }
    }
}
