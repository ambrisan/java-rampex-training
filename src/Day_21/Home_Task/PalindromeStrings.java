package Day_21.Home_Task;

import java.util.*;
import java.util.stream.*;

public class PalindromeStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("madam", "java", "level", "hello", "radar");

        List<String> result = list.stream()
                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
