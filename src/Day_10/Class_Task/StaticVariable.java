package Day_10.Class_Task;

public class StaticVariable {
    public static void main(String [] args){
        AiDsStudent s1 = new AiDsStudent();
        AiDsStudent s2 = new AiDsStudent();
        s1.name="Rishwath";
        s2.name="Shree";
        s1.id=1;
        s2.id=2;

    }
}
//Student class is seperately
class AiDsStudent {
    String name;
    int id;
    static String dept = "Ai&Ds";

    public static void readDeptName() {
        System.out.print(dept);
    }

    public void doHackathon() {
        System.out.print("Doing Hackathon");
        System.out.print(name);
        System.out.print(dept);
    }
}
