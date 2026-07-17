package Day_20.Class_Task;
import java.util.Arrays;
public class MultiDimensionalArray {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
//        int [] b1 = {101, 102};
//        int [] b2 = {105, 106};
//        int [] [] benches = {b1, b2};
//        System.out.println(Arrays.toString(benches));
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
//        for(int i=0; i<=arr.length; i++){
//            for(int j=0; j<=arr.length; j++){
//        for(int i=arr.length-1; i>=0; i--){
//            for(int j=arr[i].length-1; j>=0; j--){
//                System.out.println(arr[i][j]);
//            System.out.println(Arrays.toString(arr[0][0]));
//            }
//            System.out.println();
//        }
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                sum = sum + arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
