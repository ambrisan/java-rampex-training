package Day_20.Class_Task;
import java.util.stream.Stream;
public class InfiniteStream {
    public static void main(String [] args){
//        Stream.iterate(0,n->n+2).limit(10).forEach(n->System.out.println(n));
//        Stream.iterate(0,n->n+2).forEach(n->System.out.println(n));
//        Stream.iterate(0,n->n+1).forEach(n->System.out.print(n));
        Stream<String> s = Stream.of("Rahul", "Keerthi", "Pravin", "Kishore");
//        s.count();
        System.out.println(s.map(n->n.length()).reduce(0,(a,b)->a>b?a:b));
//        Stream.iterate(0, n->n+1).limit(4).forEach(n->System.out.println(n));
    }
}
