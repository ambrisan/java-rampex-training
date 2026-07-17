package class_task;
import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr ={5, 4, 3, 2, 1, 7, 8, 9};
        bubblesort(arr);
    }
    public static void  bubblesort (int [] arr){
        //how may comparisons and how many pass
        int n=arr.length, temp=0, count=0;
        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-1; j++){
                count++;
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("      "+Arrays.toString(arr));
                }

            }
        }
        System.out.println("____________________________");
        System.out.println("final " + Arrays.toString(arr));
        System.out.println("count "+count);
        System.out.println("swap "+temp);
    }
}