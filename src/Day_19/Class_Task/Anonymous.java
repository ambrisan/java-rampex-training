package Day_19.Class_Task;

public class Anonymous {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.shout();
//        Person p1 = new Person() {
//        new human() {
        interface human{
            public void shout();
        }
        String name = "sree";
        System.out.println(name.toUpperCase());
        System.out.println("sree".toUpperCase());
        human h = new human() {
            public void shout() {
                System.out.println("Someone is Shouting");
            }
        };//.shout();
    }
}
class human{
    public void run(){

    }
}
class Person{
    String name = "Shree";
    int age;
    public void shout(){
        System.out.println(name + " is Shouting");
    }
}