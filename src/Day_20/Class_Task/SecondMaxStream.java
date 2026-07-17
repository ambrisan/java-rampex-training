package Day_20.Class_Task;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.HashMap;
public class SecondMaxStream {
    public static void main(String [] args){
        int [] arr = {1,2,5,4,3};
        Arrays.stream(arr).sorted().skip(3).limit(1).forEach(n->System.out.print(3));
//        Arrays.stream(arr).filter(0,());
        String name = "Nikitha";
        //Finding freq using stream api
//        Stream<String> s = Stream.of(name);
//        Character [] ch = name.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//        Stream.of('N','i','k','i','t','h','a');
        Stream st = Stream.of('N','i','k','i','t','h','a');
        st.forEach(n->hm.put((Character)n,hm.getOrDefault(n,0)+1));
//        Arrays.stream(ch);
        System.out.println(hm);
    }
}
