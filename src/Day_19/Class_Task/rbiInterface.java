package Day_19.Class_Task;

//interface rbi{
//    public void checkBalance(int a);
//}
interface Calculator{
    boolean calculate(int a, int b);
}
//Driver Class
public class rbiInterface{
    public static void main(String [] args){
//        rbi b = ()->{};
//        rbi b = (int a)-> {
//            System.out.println(a * a);
//        };
//        rbi b = (int a)-> a;
//        System.out.println(b.checkBalance(a));
        Calculator add = (int a, int b)->{ //{a * b}
            return false;
        };
        System.out.println(add.calculate(4,5));
    }
}
//public class rbi {
//    public static void main(String [] args){
//    }
//}
//class Bank implements rbi{}