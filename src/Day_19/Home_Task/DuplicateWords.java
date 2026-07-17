package Day_19.Home_Task;

import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful and java is popular";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) > 1) {
                list.add(word);
            }
        }

        System.out.println(list);
    }
}
