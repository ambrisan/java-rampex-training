package Day_16.Home_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        System.out.println("Unique elements: " + uniqueList);
    }
}
//public class RemoveDuplicatesArrayList {
//    public static void main(String[] args) {
//        int [] arr = {1, 2, 2, 3, 4, 4, 5};
//        ArrayList<Integer> a = new ArrayList<>();
//        ArrayList<Integer> b = new ArrayList<>();
//        for(int i:arr){
//            a.add(i);
//        }
//        a.add(i);
//Nested Loop
//        boolean dup = false;
//        for(int i=0; i<a.size(); i++) {
//            for (int j = i+1; j < a.size(); j++) {
//                if(a.contains(a.get(i)));
//                a.remove();
//                if(a.get(i).equals(a.get(j))){
//                    dup=true;
//                    break;
//                }//after comparing i with the inner loop
//            }
//            if(dup == false) {
//                b.add(a.get(i));
//            }
//        }
//        System.out.println(b);
//    }
//}