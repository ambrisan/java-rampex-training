package Day_12.Class_Task;

public class IsaRelation1 {
    public static void main(String [] args){
        Phone p1 = new Phone();
        Sim s1 = new Sim();
        Sim s2 = new Sim();
        p1.call(s1,959777949);
        p1.call(s2,740279391);
        BsnlSim b1 = new BsnlSim();
        p1.call(b1, 994307456);
    }
}
class Phone{
//    Phone(){
//        System.out.println("Phone object created");
//    }
    public void call(Sim s, int num ){
        System.out.println("Calling..." + num);
    }
}
class Sim{
    //class
}
class BsnlSim extends Sim{

}