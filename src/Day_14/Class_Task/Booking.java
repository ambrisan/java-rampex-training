package Day_14.Class_Task;
import java.util.*;
public class Booking {
    public static void main(String[] args) {
        try {
            bookTicket();
        } catch (InvalidAgeException e) {
            e.printStackTrace();
            try {
                bookTicket();
            } catch (InvalidAgeException ee) {

            }
        }
        System.out.println("Last Line");
    }

    public static void bookTicket() throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            InvalidAgeException ex = new InvalidAgeException();
            throw ex;
            //System.out.println("throw new ArithmeticException()");
        } else {
            System.out.print("Enter how many Tokens: ");
            int ticketNos = sc.nextInt();
            System.out.println(ticketNos + " printed");
        }
    }
}

    class InvalidAgeException extends Exception {
        InvalidAgeException() {
            super(" Dont enter Invalid age");
        }
    }
