package Day_17.Home_Task;

import java.util.*;

public class StudentNames {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Rahul");
        list.add("Arun");
        list.add("Priya");
        list.add("Divya");

        Collections.sort(list);
        System.out.println("Ascending : " + list);

        Collections.reverse(list);
        System.out.println("Descending : " + list);
    }
}