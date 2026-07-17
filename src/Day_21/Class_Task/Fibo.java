package Day_21.Class_Task;

public class Fibo {
    public static void main(String [] args){
        System.out.println(fibo(45));
//        fibo(2);
//        0 1 1 2 3 5 8 13
//        for(int i = 0; i < 10; i++) {
//            System.out.println(fibo(i));
//        }
    }
    public static int fibo(int n){
        if(n==0){return 0;}
        else if (n==1){return 1;}
        return fibo(n-1)+ fibo(n-2);
    }
}
