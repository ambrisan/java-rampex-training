package Day_14.Class_Task;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int rNum = (int) (10 * Math.random());

        System.out.println("Guess the Number: ");
        int num = sc.nextInt();
        if(num == rNum){
            System.out.println("You won!!!");
        }else{
            System.out.println("You lose!!! it is " + rNum);
        }
    }
}
