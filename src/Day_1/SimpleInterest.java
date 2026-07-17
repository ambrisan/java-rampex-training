package Day_1;
public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 5;

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal Amount: " + principal);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Time Duration: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

