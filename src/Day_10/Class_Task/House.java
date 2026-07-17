package Day_10.Class_Task;

public class House {
    String color ="skyblue";
    String owner;
    int doors= 3;
    int rooms= 4;
    int windows= 10;
    int bhk = 2;
    public void openDoors(){
        System.out.print("door opened");
    }
    public static void main(String [] args){
        House sHome = new House();
        House yHome = new House();
        sHome.owner="shree";
        System.out.println(sHome.owner);
        System.out.println(yHome.owner);
        yHome.owner="yuga";
        yHome.color="pink";
        sHome.color=yHome.color;
        System.out.print("The HouseOwner: " + sHome.owner + " and the house color is " + sHome.color);
    }
}
