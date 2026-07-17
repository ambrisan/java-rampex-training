package Day_18.Class_Task;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String [] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Shree");
        hm.put(2, "Saravanan");
        hm.put(3, "Deekchith");
        hm.put(4, "Nilan");
        hm.put(null, "Junior");
//        hm.put(4, null);
//        hm.remove(2);
//        System.out.print(hm);
//        System.out.print(hm);
//        System.out.println(hm.get(3));
//        System.out.println(hm.get(3));
//        System.out.println(hm.containsValue(null));
        hm.remove(3);
        System.out.println(hm.get(2).length());
        System.out.println(hm.get(5));
    }
}
