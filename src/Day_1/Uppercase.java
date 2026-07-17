package Day_1;

public class Uppercase {


    public static void main(String[] args) {
        char letter = 'a';

        if (letter >= 65 && letter <= 91) {
            System.out.println(letter + " is an uppercase");
        }
        else if (letter >= 97 && letter <= 122) {
            System.out.println(letter + " is a lowercase");
        }
        else if (letter >= '0' && letter <= '9') {
            System.out.println(letter + " is a digit");
        }
        else {
            System.out.println(letter + " is a spl character");
        }
    }
}
