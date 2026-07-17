package Day_19.Class_Task;
import java.util.function.Predicate;
//import java.util.function.Consumer;
//import java.util.function.Supplier;
//import java.util.function.Function;
import java.util.function.*;
public class FunctionalInterface {
    public static void main(String[] args) {
//        Predicate<Integer> p = (Integer n)->n%2==0;
//        System.out.println(p.test(23));
        Consumer<String> print = s -> System.out.println(s);
        Supplier<String> greet = () -> "Hello";
        Supplier<Integer> s = () -> 6;
        Function<String, Integer> f = (String str) -> Integer.valueOf(str.toUpperCase());
        Function<String, Integer> m = (String str) -> Integer.valueOf(str.toUpperCase());
        System.out.println(f.apply("Shree"));
        System.out.println(m.apply("Saravanan"));
    }
    Function<String, Integer> len = s -> s.length();
//    public interface Supplier(){
//
//    }
}
