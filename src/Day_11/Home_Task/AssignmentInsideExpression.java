package Day_11.Home_Task;

public class AssignmentInsideExpression {
    public static void main(String [] args){
        int a=10;
        int b=(a=20)+a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
