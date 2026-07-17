package Day_11.Class_Task.OOP;

public class InterfaceTesting {
    public static void main(String [] args){
        Vivo v1 =new Vivo();
        v1.call();
        v1.message();
    }
}
interface Phone1{
    public void call();
    public void message();
}
class Vivo implements Phone1{
    public void call(){
        System.out.println("Calling from Vivo");
    }
    public void message(){
        System.out.println("Messaging from Vivo");
    }
}
