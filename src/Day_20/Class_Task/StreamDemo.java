package Day_20.Class_Task;
import java.util.*;
public class StreamDemo {
    public static void main(String [] args){
        int [] arr = {4,3,5,7,8,2,1,9,10,6};
        Arrays.stream(arr).filter((n)->n%2==0).sorted().forEach(n->System.out.println(n));//ForEven
//        Arrays.stream(arr).filter((n)->n%2!=0).sorted().forEach(n->System.out.println(n));//ForOdd
        //Using ArrayList
        ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        li.add(3);
        System.out.println(li.stream().sorted());
//        li.stream().sorted().forEach((n)->System.out.println(n));
//        System.out.println(li);
//        li.stream().map(n->n*2).forEach(n->System.out.println(n));
    }
}
