package Day_17.Home_Task;

import java.util.*;

public class SwapElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Collections.swap(list, 1, 3);

        System.out.println(list);
    }
}
