package Day_18.Class_Task;
import java.util.ArrayDeque;
public class ArrayDequeueTest {
    public static void main(String [] args){
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.add(5);
        dq.add(6);
        dq.add(7);
        System.out.println(dq);
//        dq.poll();
//        System.out.println(dq.poll());//Will remove the indexed value
//        System.out.println(dq.poll());
//        System.out.println(dq.peek());//Will not remove the indexed value
//        System.out.println(dq.peek());
//        System.out.println(dq);
        String name = "anu";
        String name1 = "anu";
        String name2 = new String("anu");
        String name3 = new String("anu");
        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(name));
    }
}
