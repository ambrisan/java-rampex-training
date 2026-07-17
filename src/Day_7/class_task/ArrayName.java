package Day_7.class_task;
import java.util.Arrays;
public class ArrayName {
    public static void main(String [] args){
            int [] arr = new int[5];
            for (int i=0; i <= 4; i++){
                arr[i] = i * 2;
                //System.out.println(Arrays.toString(arr));
            }
            System.out.println(Arrays.toString(arr));
    }
}
