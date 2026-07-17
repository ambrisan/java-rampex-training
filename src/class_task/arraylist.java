package class_task;
import java.util.ArrayList;
import java.util.LinkedList;
public class arraylist{
    public static void main(String [] args ){
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> li = new LinkedList<>();
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        long start =System.nanoTime();
        for(int i=0;i<1000;i++){
            arr.add(i);
        }
        System.out.println("added in Arraylist");
        long end= System.nanoTime();
        System.out.println("added array list in "+  (end-start));
    }
}