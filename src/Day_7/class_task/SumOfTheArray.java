package Day_7.class_task;

public class SumOfTheArray {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,5};
    
        int sum = 0;
        for(int i=0; i<5; i=(2*i)-1) { //>0,2,4
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
