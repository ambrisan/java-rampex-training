package Day_16.Home_Task;

import java.util.LinkedList;

public class TrainCoachManagement {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();

        // Input operations
        train.addFirst("Engine"); // Add at front
        train.addLast("Coach1");  // Add at back
        train.addLast("Coach2");  // Add at back
        train.addLast("Guard");   // Add at back

        // Remove the last coach
        train.removeLast();

        // Output the remaining order
        System.out.println(train);
    }
}
