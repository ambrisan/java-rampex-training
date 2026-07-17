package Day_6.HomeTask;

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Displaying the Menu
            System.out.println("\n--- MENU-DRIVEN CALCULATOR ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            // Perform calculations based on choice (if not exiting)
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Error! Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting Calculator... Goodbye!");
            } else {
                System.out.println("Invalid choice! Please select an option between 1 and 5.");
            }

        } while (choice != 5); // Continues until choice is 5

        scanner.close();
    }
}
