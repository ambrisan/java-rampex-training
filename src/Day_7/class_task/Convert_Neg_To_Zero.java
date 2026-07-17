package Day_7.class_task;

public class Convert_Neg_To_Zero {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
        System.out.println("Original array:");
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < 0) {
                numbers[i] = 0;
            }
        }
        
        System.out.println("\nArray after converting negative numbers to zero:");
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
