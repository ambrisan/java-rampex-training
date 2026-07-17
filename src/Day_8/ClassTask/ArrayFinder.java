package Day_8.ClassTask;
import java.lang.String;
import java.util.Scanner;

public class ArrayFinder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        String name = scanner.nextLine();
        int vowelCount = 0;
        System.out.print("Vowels found: ");
        String lowerCaseName = name.toLowerCase();
        for (int i = 0; i < lowerCaseName.length(); i++) {
            char ch = lowerCaseName.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(name.charAt(i) + " ");
                vowelCount++;
            }
        }
        System.out.println("\nTotal number of vowels: " + vowelCount);
        scanner.close();
    }
}
