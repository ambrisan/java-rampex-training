package Day_11.Class_Task.OOP.Table;

public class ChildClass extends AccessModifier {
    public static void main(String[] args) {
        AccessModifier p1 = new AccessModifier();
        System.out.println(p1.phone);
        Game g1 = new Game();
        System.out.println(g1.name);

    }
}
class Game{
    String name = "pubg";
}
