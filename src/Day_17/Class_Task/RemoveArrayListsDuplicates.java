package Day_17.Class_Task;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveArrayListsDuplicates {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 3, 4, 4, 5};
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i:arr){
            a.add(i);
        }
//        a.add(i);
//Nested Loop
        boolean dup = false;
        for(int i=0; i<a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                if(a.contains(a.get(i)));
//                a.remove();
                if(a.get(i).equals(a.get(j))){
                    dup=true;
                    break;
                }//after comparing i with the inner loop
            }
            if(dup == false) {
                b.add(a.get(i));
            }
        }
        System.out.println(b);
    }
}
