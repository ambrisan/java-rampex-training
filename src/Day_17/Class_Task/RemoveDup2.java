package Day_17.Class_Task;
import java.util.Arrays;
import java.util.*;
public class RemoveDup2 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 4};
//        int[] arr = {4,3,2,1,1};
        int[] arr = {3,2,1,4};
        removeDup(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void removeDup(int [] nums) {
        //add all the elements to treeSet
        //then add all the element from the set to the num array
        //Write the code to remove the Duplicate
        //from the array
        HashSet<Integer> hs = new HashSet<Integer>();
        for(Integer i : nums) {
            hs.add(i);//take all the element from the HashSet and assigning to
            //nums Array
        }
        int index = 0;
        for(int i=0; i<hs.size(); i++){
            nums[index++] = i;
        }
        System.out.println(hs);
    }
}
