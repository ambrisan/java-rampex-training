package Day_9.home_task;

public class Second_Longest_String_Starts_with_Ra {
    public static void main(String[] args) {
        String[] arr = {"Ravi", "Ramya","Vighnesh","Ram"};
        String longest = "";
        String secondLongest = "";

        for (String str : arr) {
            if (str.startsWith("Ra")) {
                if (str.length() > longest.length()) {
                    secondLongest = longest;
                    longest = str;
                } else if (str.length() > secondLongest.length() && !str.equals(longest)) {
                    secondLongest = str;
                }
            }
        }

        if (!secondLongest.isEmpty()) {
            System.out.println("Second longest string starting with 'Ra': " + secondLongest);
        } else {
            System.out.println("No second longest string found starting with 'Ra'.");
        }
    }
}