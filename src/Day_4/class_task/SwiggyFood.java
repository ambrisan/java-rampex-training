package Day_4.class_task;
import java.util.Scanner;
class SwiggyFood{
    public static void main(String[] args){

        System.out.println("Enter 1 to Display Veg items");
        System.out.println("Enter 2 to Display Non-veg items");
        System.out.println("Enter 3 to Display Sweet and Dessert items");
        System.out.println("Enter 4 to Exit");
        System.out.print("Enter the Number :");

        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        if(num ==1){
            System.out.print("Veg items - Veg Biriyan,Idli,Dosa,Appam,Medu Vada");
        }
        else if(num == 2){
            System.out.print("Non-veg items - Grill chicken,Mutton Curry,Mutton Biriyani,Chicken Biriyani,Tandoori Chicken");
        }
        else if(num ==3){
            System.out.print("Sweet and Dessert items - Tiramisu,Gulab Jamun,Rasgulla,Cookies & Brownies,Cakes & Cheesecakes");
        }
        else if(num ==4){
            System.out.print("EXIT");
        }
        System.out.print("Thank you choosing our hotel");
        sc.close();
    }
}