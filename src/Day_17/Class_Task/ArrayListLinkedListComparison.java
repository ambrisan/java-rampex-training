package Day_17.Class_Task;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListComparison {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> li = new LinkedList<>();
//        System.nanoTime();
//        System.out.println(System.nanoTime());
//        Thread.sleep(3000);
//        System.out.println(System.nanoTime());
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
//            arr.add(i);
            arr.get(i);
        }
        long end = System.nanoTime();
//        System.out.println("Added in ArrayList in " + (end - start) + "ms");
        System.out.println("Reading in ArrayList in " + (end - start) + "ms");
//adding in LinkedList
        long lstart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
//            li.add(i);
            li.get(i);
        }
        long lend = System.nanoTime();
//        System.out.println("Added in LinkedList in " + (lend - lstart) + "ms");
        System.out.println("Reading in LinkedList in " + (lend - lstart) + "ms");
    }
}
