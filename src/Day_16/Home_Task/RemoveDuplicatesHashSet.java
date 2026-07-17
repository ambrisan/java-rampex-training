package Day_16.Home_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        HashSet<Integer> uniqueSet = new HashSet<>(list);

        System.out.println("Unique elements: " + uniqueSet);
    }
}
