package Day_19.Home_Task;

import java.util.HashSet;

public class FirstRepeated {
    public static void main(String[] args) {

        String str = "programming";

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println(ch);
                break;
            }
            set.add(ch);
        }
    }
}