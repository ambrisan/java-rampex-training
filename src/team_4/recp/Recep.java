package team_4.recp;
import Login.LoginTest;

import java.util.Scanner;
import java.util.ArrayList;

import static Appointment.Management.addAppointment;
import static Appointment.Management.viewAppointments;
import static Bills.Bill.generateBill;

public class Recep {
    public static void recepMenu(){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> recepUser=new ArrayList<>();
        ArrayList<String> recepPass=new ArrayList<>();
        recepUser.add("Arun");
        recepPass.add("Arun1234");
        while(true){
            System.out.print("Enter receptionist user name:");
            String user=sc.nextLine();
            System.out.println("Enter password");
            String pass=sc.nextLine();
            int index= recepUser.indexOf(user);
            if(index!=-1 && recepPass.get(index).equals(pass)){
                System.out.println("Welcome Receptionist!!!");
                break;
            }
        }
        while(true){
            System.out.println("***** Receptionist Dashboard *****");
            System.out.println("1.Book appointment");
            System.out.println("2.View appointment");
            System.out.println("3.Generate Bills");
            System.out.println("4.Logged Out");
            System.out.println("Enter Choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    addAppointment();
                    break;
                case 2:
                    viewAppointments();
                    break;
                case 3:
                    generateBill();
                    break;
                case 4:
                    System.out.println("Logged out");
                    System.out.println("Thank you!!!");
                    LoginTest.loginMenu();
                    return;
                case 5:
                    System.out.println("Invalid choice");

            }
        }

    }
}
