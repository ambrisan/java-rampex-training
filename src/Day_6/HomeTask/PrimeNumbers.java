package Day_6.HomeTask;

import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            return;
        }
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Output : None (Input must be greater than 0)");
            return;
        }

        System.out.print("Output : ");
        generateNPrimes(n);

        scanner.close();
    }

    // Method to generate and print the first N prime numbers
    public static void generateNPrimes(int n) {
        int count = 0;  // Keeps track of how many primes we've found
        int number = 2; // The number we test for primality (starting with the first prime)

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number);
                count++;

                // Print a comma after the number, except for the last one
                if (count < n) {
                    System.out.print(",");
                }
            }
            number++;
        }
        System.out.println(); // New line at the end
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        // Check divisors from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}