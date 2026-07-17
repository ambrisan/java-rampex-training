package Day_8.ClassTask;
import java.lang.String;
import java.util.Scanner;

public class FilteronlyAlphabets {
        public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your insta user name: ");
        String userName = sc.nextLine();
        for (int i = 0; i < userName.length(); i++) {
            if (userName.charAt(i) >= 'a' && userName.charAt(i) <= 'z') {
                System.out.println(userName.charAt(i));
            }
          

        }
    }
}
