package Day_18.Class_Task;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QueueTask {
    public static void main(String [] args){
        String [] task = {"Download", "Compile", "Test", "Deploy"};
        ArrayDeque<String> dq = new ArrayDeque<String>();
        ArrayList<String> ta = new ArrayList<String>(List.of(task));
        Collections.sort(ta);
        System.out.println("Sorted List : " + ta);
        for(String t : task){
            dq.add(t);
            System.out.print(t);
        }
        System.out.println();
        //Printing the Task
        for(String t : dq) {
            System.out.print(t + "->");
//            System.out.println("Sorted List : " + Collections.sort(dq));
        }
    }
}
