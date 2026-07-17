package Day_17.Home_Task;

import java.util.*;

public class MaxMinList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(78);
        list.add(90);
        list.add(67);
        list.add(95);
        list.add(88);

        System.out.println("Maximum = " + Collections.max(list));
        System.out.println("Minimum = " + Collections.min(list));
    }
}
