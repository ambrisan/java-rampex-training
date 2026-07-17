package Day_19.Home_Task;

import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {

        int[] arr = {12, 45, 23, 89, 67, 89, 34};

        int second = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .get();

        System.out.println(second);
    }
}