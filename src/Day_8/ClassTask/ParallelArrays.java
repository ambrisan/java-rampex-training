package Day_8.ClassTask;
import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;
public class ParallelArrays {
    public static void main(java.lang.String[] args){
       
            Scanner sc = new Scanner(System.in);
        java.lang.String[] drinks = {"pepsi", "sprite","mazza","mountain dew", "campa"};
        int [] prices = {40,20,45,40,10};
        System.out.println(Arrays.toString(drinks));
        System.out.print("Enter the name of the drink: ");
        String name = sc.nextLine();
        System.out.println("Enter the Quantity: ");
        int qty = sc.nextInt();
        for(int i=0; i<drinks.length;i++) {
            if (name.equals(drinks[i])){
                System.out.println(prices[i] * qty);
            }
        }
    }
}
