package Day_17.Home_Task;

import java.util.*;

public class SortAndSearch {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(30);

        Collections.sort(list);

        System.out.println("Sorted List : " + list);

        int index = list.indexOf(30);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}