package Day_7.class_task;

public class Greater_Than_Avg {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = (double)sum / numbers.length;
        System.out.println("Average: " + avg);
        
        System.out.println("Numbers greater than average:");
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > avg) {
                System.out.println(numbers[i]);
            }
        }
    }
}
