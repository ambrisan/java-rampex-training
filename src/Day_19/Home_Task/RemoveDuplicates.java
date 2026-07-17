package Day_19.Home_Task;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};

        System.out.println(Arrays.toString(
                Arrays.stream(arr).distinct().toArray()));
    }
}