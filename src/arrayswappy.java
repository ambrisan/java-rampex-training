import java.util.*;
public class arrayswappy{
    public static void main(String[] args){
        String [] menu={"veg", "non-neg", "sweets", "beverages"};
        String [] m1=new String[menu.length];
        for(int i=0;i<menu.length;i++){

            m1 [0]=menu[menu.length-1-i];
        }
        System.out.println(Arrays.toString(m1));
    }
}