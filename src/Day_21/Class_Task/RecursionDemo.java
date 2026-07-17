package Day_21.Class_Task;

public class RecursionDemo {
    public static void main(String [] args){
//        int a=0;
        int a=5;
        fun(a);
    }
    public static void fun(int a){
//        if(a==5){
        if(a==0){
            return;
        }
        System.out.println(a);
//        a++;
        a--;
        fun(a);

//        a++;
//        System.out.println(a);
//        fun(a);
//        int a=0;
//        System.out.println("Hello");
//        a++;
    }
}
