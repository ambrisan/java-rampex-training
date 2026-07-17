package Day_1;

import java.util.Scanner;

public class swiggy {

    public static void main(String[] args) {
        String originalUsername = "Divya";
        int originalPassword = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a original Username: ");
        String username = sc.nextLine();
        if (username.equals(originalUsername)) {

            System.out.print("Enter a original Password: ");
            int password = sc.nextInt();

            if (password == originalPassword) {
                System.out.print("Welcome " + username);

            } else {
                System.out.print("Enter the correct password");
            }
        } else {
            System.out.print("Enter the correct username");
        }

    }
}