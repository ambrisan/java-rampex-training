package Day_8.ClassTask;
import java.lang.String;
import java.util.Arrays;
public class ArrayReverse {
    public static void main(java.lang.String[] args){
            java.lang.String[] menu = {"Veg", "Non-Veg", "Sweets", "Beverages"};
            java.lang.String[] m1 = new String[menu.length];
            for(int i=0 ;i<menu.length;i++){
                m1 [i]=menu[menu.length -1-i];
            }
            System.out.println(Arrays.toString(m1));
            for(int i=0 ;i<menu.length;i++){
                m1 [i]=menu[menu.length -1-i];
            }
            System.out.println(Arrays.toString(m1));
        }
    }

