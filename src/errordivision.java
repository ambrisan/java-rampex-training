public class errordivision {
    public static void main(String[] args){
        int a=10, b=5, c=5;
        int x=a/(b+c);
        System.out.println("x= "+x);
        int arr[]= new int [-5];//NegativeArraySizeException
        int y=a/(b-c); //ArithmeticException
        System.out.println("y= "+y);

    }
}
