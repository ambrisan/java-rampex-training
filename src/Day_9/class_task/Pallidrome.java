package Day_9.Class_Task;

public class Pallidrome{
    public static void main(String[] args) {
        String a="racecar";
        boolean isPalindrome = true;
        for (int i =0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("palindrome");
        }
        else{
                System.out.println("not palindrome");
            }
        }
    }
