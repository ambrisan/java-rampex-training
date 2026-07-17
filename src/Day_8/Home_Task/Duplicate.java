package Day_8.Home_Task;

public class Duplicate {
    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 2, 8, 5, 9, 7, 7};
        System.out.println("Duplicate Elements:");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                boolean duplicate = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        duplicate = true;
                    }
                }

                if (!duplicate) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
