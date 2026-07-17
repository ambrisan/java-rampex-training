package Day_7.home_task;

public class NumberPattern {
    public static void main(String[] args) {
        // Upper half of the pattern (rows with decreasing length)
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        // Lower half of the pattern (rows with increasing length)
        for (int i = 4; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
