package Day_8.ClassTask;

import java.util.Scanner;

public class String {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        java.lang.String name = sc.nextLine();
     
        int n = name.length();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
}
