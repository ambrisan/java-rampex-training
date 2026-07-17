package Day_20.Class_Task;

public class MdArray {
    public static void main(String [] args){
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int num = 12;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if(i == j) {
                    System.out.print(nums[i][j] + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(nums);
//        int num = 12;
//        for(int i=0; i<nums.length; i++){
//            for(int j=0; j<nums[i].length; j++){
//                if(i == j) {
//                    if (j == i || j == num - i - 1) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//        System.out.println(nums);
//
//        int [] [] nums = new int [3][4];
//        Ascending Order of Numbers
//        int num = 1;
//        for(int i=0; i<nums.length; i++){
//            for(int j=0; j<nums[i].length; j++){
//                nums[i][j] = num;
//                System.out.print(nums[i][j] + " ");
//                num++;
//            }
//            System.out.println();
//        }
//        System.out.println(nums);
//        Descending Order of Numbers
//        int[][] nums = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//        int num = 12;
//        for(int i=0; i<nums.length; i++){
//            for(int j=0; j<nums[i].length; j++){
//                nums[i][j] = num;
//                System.out.print(nums[i][j] + " ");
//                num--;
//            }
//            System.out.println();
//        }
//        System.out.println(nums);
    }
}
