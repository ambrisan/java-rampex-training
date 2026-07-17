package Day_8.Home_Task;
import java.util.Scanner;

public class AnotherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] drinks = {"pepsi", "sprite", "maza", "mountain dew", "campa"};
        int[] prices = {40, 20, 45, 40, 10};
        int[] stock = {10, 5, 8, 3, 6};
        System.out.println("pepsi, sprite, maza, mountain dew, campa");
        System.out.print("Enter the name of the drink: ");
        String name = sc.nextLine();
        System.out.println("Enter the Quantity: ");
        int qty = sc.nextInt();
        for (int i = 0; i < drinks.length; i++) {
            if (name.equals(drinks[i])) {
                if (stock[i] >= qty) {
                    stock[i] = stock[i] - qty;
                    int amount = prices[i] * qty;
                    System.out.println("Order Successful");
                    System.out.println("Total Amount: " + amount);
                    System.out.println("Remaining Stock: " + stock[i]);
                } else {
                    System.out.println("Out of Stock");
                    System.out.println("Available Stock: " + stock[i]);
                }
                break;
            }
        }
    }
}