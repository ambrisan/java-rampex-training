package Day_7.class_task;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String [] args){
        int [] arr = new int[5];
        for (int i=0; i < 5; i=i+2){
            arr[i] = (2*i)-1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
