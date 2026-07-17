package Day_16.Class_Task;
import java.util.HashSet;
public class HashSetIntro {
    public static void main(String [] args){
//        HashSet<Integer> h = new HashSet<Integer>();
        HashSet<Character> h = new HashSet<>();
//        h.add(4);
//        h.add(4);
//        h.add(8);
//        h.add(2);
//        h.add(5);
//        System.out.print(h);
        for(int i=0; i<10; i++){
//            h.add(i);
            h.add(Character.valueOf((char)i));
        }
        System.out.println(h);
    }
}
