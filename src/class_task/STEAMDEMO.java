package class_task;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class STEAMDEMO {
    public static void main(String[] args) {
        int [] arr = {4, 3, 5, 7, 8, 2, 1, 9, 10, 6};
        //Arrays.stream(arrZ).filter((n) -> n % 2 == 0).sorted().forEach(n -> System.out.println(n));

        ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        //Stream<Integer>s4=Stream.iterate(0,n->n+2 ).limit(10).forEach(n->System.out.println(n));
        li.add(3);
        li.stream().sorted().forEach((n)->System.out.println(n));
        //(s.map(n->n.length()).reduce(0. (a,b)->a>b?a:b))
        //(s,map(n->n.toUpperCase()).collect(Collectors.toList())
        //
        //System.out.println(li);

    }
}
