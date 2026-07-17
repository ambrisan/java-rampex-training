package Day_11.Class_Task;

public class ArmstrongNumber {
    public int num = 153;
    public static void main(String [] args){
        //checkArmstrong(153);
        System.out.print(checkArmstrong(153));
    }
    //check Armstrong
    public static boolean checkArmstrong(int num){
        //count how many digits in a number
        //47
        int temp = num;
        int original = num;
        int digit = 0;
        while(temp!=0){
            temp = temp/10; //4 count+=1
            digit++;
        }
        //System.out.print("Num of Digit: " + digit);
        //add numbers with the digit power
        int sum = 0;
        int rem;
        while(num!=0){
            rem = num%10;
            sum = sum+(int)(Math.pow(rem,digit));
            num = num/10;
        }
        System.out.println("The Ams Sum is: " + sum);
        if(original==sum){
            return true;
        }else{
            return false;
        }
        //return true;
    }
}
