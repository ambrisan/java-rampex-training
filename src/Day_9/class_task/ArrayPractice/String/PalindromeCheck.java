package Day_9.Class_Task.ArrayPractice.String;
import java.util.Arrays;
public class PalindromeCheck {
    public static void main(String [] args){
        String s = "shree saravanan";
        //Create a char Array
        //Add the character into the Array
        //Reverse the Array
        //Convert the Array to String using methods
        //Compare original and reversed print true or false
        char[] ch = new char[s.length()];
        int n = s.length();
        for(int i=0; i<s.length();i++){
            ch[i]=s.charAt(n-1-i);
          
        }
        System.out.println(ch);
        String rev = "";
        for(int i=0; i<ch.length;i++){
            rev =rev+ch[i];
        }

        System.out.println("checking " + rev);
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");

        }
        System.out.print(Arrays.toString(ch));
    }
}
