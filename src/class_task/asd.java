package class_task;
public class asd {
    public static void main(String[] args) {
        isAnagram("pot", "top");
    }
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return true;
        } else {
            return false;
        }
    }
}
