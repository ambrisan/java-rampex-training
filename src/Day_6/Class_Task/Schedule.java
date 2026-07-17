package Day_6.Class_Task;

public class Schedule {
    public static void main(String[] args) {
       int dayscompleted=0;
        for (int month = 1; month <= 12; month++) {

            for (int week = 1; week <= 4; week++) {

                for (int day = 1; day <= 7; day++) {
                    if(week>=2){break;}
                    System.out.println("Month: " + month + " Week: " + week + " Day: " + day +" Days Completed: " + ++dayscompleted);
                    System.out.println("Come to College");
                }
            }
        }
    }
}

