package Day_14.Class_Task;
import java.util.Scanner;
public class ParallelArrayToObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ...Write the menu
        //let the user select the choice
        //once selected create the object and calculate the bill
        //ask the user again until, user press 0to exit
        System.out.println("WELCOME!!!");
        System.out.println();
        System.out.println("Enter 1 for mazza: ");
        System.out.println("Enter 2 for sprite: ");
        System.out.println("Enter 3 for pepsi: ");
        System.out.println("Enter 4 for campa: ");
        System.out.println("Enter 0 for exit: ");

        int choice;
        float total = 0;
        Drink []totalItems = new Drink[100];
        int pos =0;

            do {
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                System.out.println("Enter your qty: ");
                int qty = sc.nextInt();
                if (choice == 1) {
                    mazza m = new mazza();
                    total = total + qty * m.price;
                    System.out.println("item: " + m.name + ", price is: " + m.price);
                    totalItems[pos++]=m;
                }
                else if (choice == 2) {
                    sprite s = new sprite();
                    total = total + qty * s.price;
                    System.out.println("item: " + s.name + ", price is: " + s.price);
                    totalItems[pos++]=s;
                }
                else if (choice == 3) {
                    pepsi p = new pepsi();
                    total = total + qty * p.price;
                    System.out.println("item: " + p.name + ", price is: " + p.price);
                    totalItems[pos++]=p;
                }
                else if (choice == 1) {
                    campa c = new campa();
                    total = total + qty * c.price;
                    System.out.println("item: " + c.name + ", price is: " + c.price);
                    totalItems[pos++]=c;
                }else {
                    System.out.println(total + " Bill");
                }

            } while(choice != 0);{
            System.out.println("Total Price is " + total);
        }
    }
    public void display(Drink d){
        System.out.println("item: " + d.name + ", price is: " + d.price);
    }
}

    class Drink {
        String name;
        float price;
    }

    class mazza extends Drink {
        String name = "mazza";
        float price = 20f;
    }

    class sprite extends Drink {
        String name = "sprite";
        float price = 30f;
    }

    class pepsi extends Drink {
        String name = "pepsi";
        float price = 25f;
    }

    class campa extends Drink {
        String name = "campa";
        float price = 10f;
    }