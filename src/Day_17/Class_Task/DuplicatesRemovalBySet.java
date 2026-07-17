package Day_17.Class_Task;
import java.util.HashSet;
public class DuplicatesRemovalBySet {
    public static void main(String [] args){
        int [] arr = {1,2,3,2,4,3,1};
        HashSet<Integer> hs = new HashSet<>();
        for(Integer i : arr){
            hs.add(i);
        }
//        System.out.println(hs);
//        System.out.println(hs.getClass());
//        System.out.println(hs.toArray());
//        int [] arr = hs.toArray();
        int [] nums = new int[hs.size()];
        int index=0;
        for(Integer i : hs){
            nums[index++]=i;
        }
        System.out.println(hs);
    }
}
