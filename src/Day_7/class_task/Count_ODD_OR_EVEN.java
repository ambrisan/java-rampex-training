package Day_7.class_task;

public class Count_ODD_OR_EVEN {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int countOdd = 0;
        int countEven = 0;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        
        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of odd numbers: " + countOdd);
    }
}
