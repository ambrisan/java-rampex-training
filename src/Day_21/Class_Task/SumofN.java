package Day_21.Class_Task;

public class SumofN {
    public static void main(String [] args){
        int sum = 0;
//        adder(1, sum);
        System.out.println(adder(1, sum));
//        adder(10, sum);
    }
    public static int adder(int num, int sum){
//    public static void adder(int num, int sum){
        sum = sum + num;
        if(num==5){
//            return;
            return sum;
        }
//        int sum = 0;
        sum = sum+num;
        num++;
        return adder(num, sum);
//        System.out.println(sum);
//        adder(num, sum);
//        return num;
    }
}
