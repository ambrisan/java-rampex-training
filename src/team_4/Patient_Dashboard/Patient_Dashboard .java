package team_4.Patient_Dashboard;
import java.util.Scanner;

import static Appointment.Management.addAppointment;
import static Medical_record.MedicalManagement.viewRecordById;
import Login.*;

public class Patient_Dashboard {
    public static void patientMenu(){
        double billAmount = 1000;
        boolean paid = false;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("***** Patient Dashboard *****");
            System.out.println("1.Book appointment");
            System.out.println("2.View medical records");
            System.out.println("3.View and Pay bills");
            System.out.println("4.Logged out");
            System.out.println("Enter choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    addAppointment();
                    break;
                case 2:
                    System.out.println("Enter patient id:");
                    int patientid=sc.nextInt();
                    viewRecordById(patientid);
                    System.out.println("Received ID: " + patientid);
                    break;
                case 3:
                    System.out.println("\n===== BILL =====");
                    System.out.println("Bill Amount : " + billAmount);

                    if (paid) {
                        System.out.println("Status : Paid");
                    } else {
                        System.out.println("Status : Pending");
                        System.out.print("Do you want to pay? (yes/no): ");
                        sc.nextLine(); // clear buffer
                        String pay = sc.nextLine();

                        if (pay.equalsIgnoreCase("yes")) {
                            System.out.print("Enter Amount: ");
                            double amount = sc.nextDouble();

                            if (amount == billAmount) {
                                paid = true;
                                System.out.println("Payment Successful.");
                            } else {
                                System.out.println("Incorrect Amount.");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Logged out!!!");
                    System.out.println("Thank you");
                    LoginTest.loginMenu();
                    return;
                case 5:
                    System.out.println("Invalid choice");
                    break;


            }
        }


    }
}
