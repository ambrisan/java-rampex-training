package team_4.Doctor_Dashboard;
import java.util.Scanner;
import java.util.ArrayList;

import static Appointment.Management.viewAppointments;

import Login.*;
import Medical_record.MedicalManagement;
import Medical_record.MedicalRecord;

public class Doctor_Dashboard {
    public static void doctorMenu(){
        ArrayList<String> docUsers=new ArrayList<String>();
        ArrayList<String> docPass=new ArrayList<String>();
        docUsers.add("Pavi");
        docUsers.add("Kiruba");
        docUsers.add("Gokul");
        docUsers.add("Elaya");
        docPass.add("Pavi@1234");
        docPass.add("Kiruba@1234");
        docPass.add("Gokul@1234");
        docPass.add("Elaya@1234");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter the Doctor user name:");
            String user=sc.nextLine();
            System.out.println("Enter the Password:");
            String pass=sc.nextLine();
            int index=docUsers.indexOf(user);
            if(index!=-1 && docPass.get(index).equals(pass)){
                System.out.println("Welcome Doctor!!!");
                break;
            }

        }
        while(true){
            System.out.println("***** Doctor Dashboard *****");
            System.out.println("1.View appointment");
            System.out.println("2.Update diagnosis");
            System.out.println("3.Prescribe medicine");
            System.out.println("5.Logged out");
            System.out.println("Enter Choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    viewAppointments();
                    break;
                case 2:
                    System.out.print("Enter patient id: ");
                    int patientId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Diagnosis: ");
                    String diagnosis = sc.nextLine();

                    System.out.print("Medicine: ");
                    String medicine = sc.nextLine();

                    System.out.print("Count: ");
                    int count = sc.nextInt();

                    MedicalRecord record = new MedicalRecord(patientId, diagnosis, medicine, count);
                    MedicalManagement.addRecord(record);

                    System.out.println("Medical record added successfully.");
                    break;
                case 3:
                    System.out.println("Enter patient id");
                    int pid=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter medicines:");
                    String medi=sc.nextLine();
                    System.out.println("count:");
                    int count1=sc.nextInt();
                    System.out.println(medi+"-"+count1);
                    break;
                case 4:
                    System.out.println("Invalid choice");
                    break;
                case 5:
                    System.out.println("Logged out");
                    System.out.println("Thank you!!!");
                    LoginTest.loginMenu();
                    return;
            }
        }

    }
}
