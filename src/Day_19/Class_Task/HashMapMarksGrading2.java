package Day_19.Class_Task;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class HashMapMarksGrading2 {
    public static void main(String[] args) {
        //Create a HashMap add Name, Mark values
//        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
        hm.put("Shree", 97);
        hm.put("Saravanan", 96);
        hm.put("Deekchith", 94);
        hm.put("Nilan", 92);
        hm.put("Deek", 100);
        System.out.println(hm.higherKey("Shree"));
//        System.out.println(hm.entrySet());
//        int min = 100;
//        int max = 0;
//        String name = "";
//        for(Map.Entry<String,Integer> e: hm.entrySet()){
//            if(e.getValue()<min) {
//          if(e.getValue()>max) {
//                    min = e.getValue();
//                name = e.getKey();
//                System.out.println(max);
//                System.out.println(name);
//            }
//        }
//        System.out.println(max);
//        System.out.println(name);
//        System.out.println(min);
//        System.out.println(name);
    }
}
