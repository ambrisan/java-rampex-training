package Day_17.Class_Task;
import java.util.PriorityQueue;
import java.util.Collections;
public class PriorityQueueTest {
    public static void main(String [] args){
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());//Collections
       pq.offer(30);
       pq.add(23);
       pq.offer(24);
       pq.add(54);
       pq.add(13);
       System.out.println(pq);
       System.out.println(pq.peek());
       System.out.println(pq.peek());
       pq.peek();
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.peek());
       System.out.println(pq.poll());
        
    }
}
