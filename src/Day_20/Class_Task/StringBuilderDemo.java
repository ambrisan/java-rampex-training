package Day_20.Class_Task;
import java.util.Scanner;
public class StringBuilderDemo {
    public static void main(String [] args){
        String name = "Shree ";
//        StringBuilder s = new StringBuilder(name);
//        String s = new StringBuilder(name).reverse().toString();
//        s.append("Saravanan");
//        System.out.println(s);
//        s = s.reverse();
//        String str = s.toString();
//        System.out.println(str);
//        String s = new StringBuilder("Saravanan").reverse().toString();
//        System.out.println(s);
//        System.out.println(new StringBuilder("Saravanan").reverse().toString());
//        Scanner sc = new Scanner(System.in);
//        System.out.println(new StringBuilder("Saravanan").reverse().toString());
//        System.out.println(new StringBuilder(sc.nextLine()).reverse().toString());
//        System.out.println(new StringBuilder(new Scanner(System.in).nextLine()).reverse().toString());
        //------
        StringBuffer s = new StringBuffer(name);
        s = s.reverse();
        String str = s.toString();
        System.out.println(str);
//        STRING BUILDER - Non-Thread Safe, Faster than String Builder
//        STRING BUFFER - Thread Safe, Slow than Stringbuffer
    }
}
