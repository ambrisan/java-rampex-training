package Day_9.home_task;
public class Find_Duplicate_Integer_In_Array_Store_In_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3};
        int[] duplicates = new int[arr.length];
        int dupIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    boolean alreadyExists = false;
                    for (int k = 0; k < dupIndex; k++) {
                        if (duplicates[k] == arr[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        duplicates[dupIndex++] = arr[i];
                    }
                }
            }
        }

        System.out.print("Duplicate integers in the array: ");
        for (int i = 0; i < dupIndex; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }
}