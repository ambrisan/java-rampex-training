package Day_1;

public class Reversenumber {

    public static void main(String[] args) {
        int num = 123;  
        int reversed = 0;

        int digit1 = num % 10;       
        int digit2 = (num / 10) % 10; 
        int digit3 = num / 100;      

        // Form reversed number
        reversed = digit1 * 100 + digit2 * 10 + digit3;

        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversed);
    }
}
