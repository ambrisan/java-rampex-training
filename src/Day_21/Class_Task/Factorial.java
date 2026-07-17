package Day_21.Class_Task;

public class Factorial {
    public static void main(String [] args){
//        int a = 5;
//        System.out.println(fact(a));
        facto(50);
    }
    public static int fact(int n){
        //Base Case n == 0;
        if(n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void facto(int m){
        int total = 1;
        for(int i=1; i<=m; i++){
            total = total * i;
        }
        System.out.println(total);
    }
}
