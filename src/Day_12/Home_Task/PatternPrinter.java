package Day_12.Home_Task;

public class PatternPrinter {
    public static void main(String[] args) {
        int rows = 4; // Number of lines to print based on the image
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(); // Move to the next line
        }
    }
}