package Day_8.Home_Task;

public class MissingNumber {
    public static void main(String[] args) {

        int N = 8;
        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int total = N * (N + 1) / 2;
        int missing = total - sum;
        System.out.println("Missing Number: " + missing);
    }
}
