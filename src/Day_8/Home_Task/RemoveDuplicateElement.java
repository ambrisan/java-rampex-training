package Day_8.Home_Task;
import java.util.*;

public class RemoveDuplicateElement {
    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 6, 2, 7, 6, 8};
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }

        System.out.println("After removing duplicates:");

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
