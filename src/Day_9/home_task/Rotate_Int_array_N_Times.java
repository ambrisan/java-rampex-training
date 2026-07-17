package Day_9.home_task;

public class Rotate_Int_array_N_Times {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3; // Number of times to rotate

        System.out.println("Original array:");
        printArray(arr);

        rotateArray(arr, n);

        System.out.println("Array after rotating " + n + " times:");
        printArray(arr);
    }

    public static void rotateArray(int[] arr, int n) {
        int length = arr.length;
        n = n % length; // Handle cases where n is greater than array length

        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, n, length - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
