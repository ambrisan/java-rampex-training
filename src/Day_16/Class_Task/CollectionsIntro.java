package Day_16.Class_Task;
import java.util.ArrayList;
public class CollectionsIntro {
    public static void main(String [] args){
        int [] Arr = {1,2,3,4,5};
        Arr[0] = 1;
//        System.out.println(Arr);
        ArrayList<Integer> nums = new ArrayList<Integer>();
//        nums.add(4);
//        nums.add(5);
//        System.out.println(nums);
//        nums.remove(0);
//        nums.remove(0);
//        System.out.println(nums);
//        nums.addAll();
//        System.out.println(nums);
//        ArrayList<Integer> nums1 = new ArrayList<Integer>();
//        nums1.add(3);
//        nums1.add(5);
//        nums1.add(7);//[3, 5, 7]
//        nums1.addAll(nums1);
//        nums1.add(3);//[3, 5, 7, 3]
//        System.out.println(nums1);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Shree");
        names.add("Saravanan");
        names.add("Deekchith");
        names.add("Nilan");
        names.add("Soon");
        System.out.println(names);
//        System.out.println(name.get(2));
//        for(int i = 0; i<= name.size(); i++){
//            System.out.println(name.get(i));
//        }
//        for(String i : name){
//            System.out.println(i);
//            System.out.println(i.length());
//        }
//        for(String i : name){
//            System.out.println(i + " " + i.length());
//        }
        for(String name : names){
            if(name.startsWith("s") == true){
                System.out.println(name);
            }
        }
    }
}
