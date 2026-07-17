package Day_19.Home_Task;

import java.util.*;

public class GroupWords {
    public static void main(String[] args) {

        String[] words = {"Java", "API", "Spring", "Collection", "Map", "Queue"};

        TreeMap<Integer, ArrayList<String>> map = new TreeMap<>();

        for (String word : words) {

            int len = word.length();

            if (!map.containsKey(len)) {
                map.put(len, new ArrayList<>());
            }

            map.get(len).add(word);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}