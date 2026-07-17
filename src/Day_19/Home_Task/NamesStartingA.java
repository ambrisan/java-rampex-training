package Day_19.Home_Task;

import java.util.Arrays;

public class NamesStartingA {
    public static void main(String[] args) {

        String[] names = {"Arun", "Bala", "Ajay", "Kiran", "Akash", "Vignesh"};

        Arrays.stream(names)
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}