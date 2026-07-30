package team_4.login;


import Admin_Dashboard.Admin_Dashboard;
import Doctor_Dashboard.Doctor_Dashboard;
import Patient_Dashboard.Patient_Dashboard;
import Receptionist_Dashboard.Recep;
import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Login l1=new Login();
        l1.loginMenu();

    }

    public static void loginMenu() {
    }
}

class Login{
    public void loginMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("*****Dashboard*****");
            System.out.println("1.Admin Dashboard");
            System.out.println("2.Doctor Dashboard");
            System.out.println("3.Patient Dashboard");
            System.out.println("4.Receptionist Dashboard");
            System.out.println("Enter Choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Admin_Dashboard.adminMenu();
                    break;
                case 2:
                    Doctor_Dashboard.doctorMenu();
                    break;
                case 3:
                    Patient_Dashboard.patientMenu();
                    break;
                case 4:
                    Recep.recepMenu();
                    break;
            }
        }
    }
}