package Day_7.class_task;

public class Rotate_array{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 1; 
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + d) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Rotated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

