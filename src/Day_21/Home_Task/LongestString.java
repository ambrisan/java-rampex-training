package Day_21.Home_Task;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");

        String longest = list.stream()
                .max((a, b) -> a.length() - b.length())
                .get();

        System.out.println(longest);
    }
}
