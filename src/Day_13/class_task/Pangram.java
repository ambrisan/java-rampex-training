package Day_13.class_task;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(str);
        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        str = str.toLowerCase();
        boolean[] present = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                present[c - 'a'] = true;
                
            }
        }

        for (boolean letterPresent : present) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
