package Day_7.class_task;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];   

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value :" );
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: " + Arrays.toString(arr));

        
    }
}

