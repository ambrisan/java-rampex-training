package Day_21.Home_Task;

import java.util.*;

public class SortLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");

        list.stream()
                .sorted((a, b) -> a.length() - b.length())
                .forEach(System.out::println);
    }
}