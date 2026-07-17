package Day_17.Class_Task;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
public class LinkedHashSetTest {
    public static void main(String [] args){
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        HashSet<String> hs = new HashSet<>();
        TreeSet<String> ts = new TreeSet<String>();
//        ls.add("Shree");
//        ls.add("Saravanan");
//        ls.add("Deekchith");
//        ls.add("Nilan");
//        ls.add("Junior");
//        hs.add("Shree");
//        hs.add("Saravanan");
//        hs.add("Deekchith");
//        hs.add("Nilan");
//        hs.add("Junior");
//        ts.add("Shree");
//        ts.add("Saravanan");
//        ts.add("Deekchith");
//        ts.add("Nilan");
//        ts.add("Junior");
//        System.out.println(ls);
//        System.out.println(hs);
//        System.out.println("Original Set: [Shree], [Saravanan], [Deekchith], [Nilan], [Junior]");
//        System.out.println("LinkedHashSet: " + ls);
//        System.out.println("HashSet: " + hs);
//        System.out.println("TreeSet: " + ts);
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        ts1.add(2);
        ts1.add(3);
        ts1.add(2);
        ts1.add(1);
        System.out.println(ts1);
//        System.out.println(ts1.higher(2));
//        System.out.println(ts1.headSet(3));
        System.out.println(ts1.tailSet(3));
    }
}
