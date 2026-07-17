package class_task;
public class RECURSIONDEMO {
    public static void main(String[] args) {
        int a=6, b=1;

        fun(a, b);
    }

    public static void fun(int a, int b){
        if(a==1){
            System.out.println(b);
            return;

        }else {

            b=b*a;
            a--;
            fun(a, b);
            //SDytem.out.println(fibo(n-1)+fibo(n-2));

        }

    }
}
