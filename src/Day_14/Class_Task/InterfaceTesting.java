package Day_14.Class_Task;

public class InterfaceTesting{
    public static void main(String [] args){
        C c1 = new C();
        c1.run();
    }
}
class A{
    void run(){
        System.out.println("A is running");
    }
}
interface b{
    void run();
}
class C extends A implements b {
    public void run() {
        System.out.println("C is running");
    }
}