package Day_11.Class_Task.OOP;

public class Polymorphism {
    //two types run type - method loading, compile type - method overloading
    public static void main(String [] args){

        greet();
        greet("Shree");
        greet("Shree","Sarvn");
        greet(20);
    }
    //same thing behaving differently in different scenarios
    public static void greet(){
        System.out.println("Good Afternoon");
    }
    public static void greet(String name){
        System.out.println("Good Afternoon " + name);

    }
    public static void greet(String name, String name2){
        System.out.println("Good Afternoon both of you " + name2);

    }
    public static void greet(int age){
        System.out.print("Good Afternoon, your age is " + age);

    }
}
