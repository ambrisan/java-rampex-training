package Day_3.class_task;
import java.util.Scanner;
class Logindetails{
    public static void main(String[]args){
        String originalUsername = "Hey";
        int originalpass =1234;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the username:");
        String username =sc.nextLine();
        System.out.print("Enter the pass:");
        int pass = sc.nextInt();
        if(originalUsername.equals(username)&&originalpass==pass){
            System.out.print("welcome!!");
        }else{
            System.out.print("Invalid credentials");
        }
    }
}