package Day_7.home_task;

public class Reverse_Int {
    public static void main(String[] args) {
        int [] num = {2, 3, 4, 5};
        int [] reversed = new int[num.length];
        for(int i = num.length - 1; i >= 0; i--) {
            reversed[num.length - 1 - i] = num[i];
        }
        for(int i = 0; i < num.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }    
}

