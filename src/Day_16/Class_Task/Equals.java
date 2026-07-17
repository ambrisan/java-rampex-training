package Day_16.Class_Task;

public class Equals {
    public static void main(String [] args){
        new Object();
//        String a = "";
//        a.^
        Car c1 = new Car("bmw","M6");
//        c1.equals();
        Car c2 = new Car("audi","A7");
//        System.out.println(c2.equals(c2));
        System.out.println(c2);
    }
}
class Car{
    String name;
    String model;
    Car(String name, String model){
        this.name = name;
        this.model = model;
    }
//    public void equals(){
//
//    }
//    public String toString(){
//
//        return "";
//    }
//    public boolean equals(Object o){
//        if(this.name.equals(o.name) && this.model = o.model){return true;}
//        else{return false;}
//    }
    //toString method will decides what will the output if of the string
    public String toString(){
        return this.name + " " + this.model;
    }

}