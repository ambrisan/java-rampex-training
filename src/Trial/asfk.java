package Trial;

import java.util.*;

//  Hospital Management System
//  A simple console-based Java application to manage patients, doctors,
//  and appointments using core OOP concepts and collections.

//  Compile: javac HospitalManagementSystem.java
//  Run:     java HospitalManagementSystem

public class asfk {

    // ---------------------- Model Classes ----------------------

    static class Patient {
        int id;
        String name;
        int age;
        String gender;
        String disease;

        Patient(int id, String name, int age, String gender, String disease) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.disease = disease;
        }

        @Override
        public String toString() {
            return "Patient ID: " + id +
                    " | Name: " + name +
                    " | Age: " + age +
                    " | Gender: " + gender +
                    " | Disease: " + disease;
        }
    }

    static class Doctor {
        int id;
        String name;
        String specialization;

        Doctor(int id, String name, String specialization) {
            this.id = id;
            this.name = name;
            this.specialization = specialization;
        }

        @Override
        public String toString() {
            return "Doctor ID: " + id +
                    " | Name: Dr. " + name +
                    " | Specialization: " + specialization;
        }
    }

    static class Appointment {
        int appointmentId;
        Patient patient;
        Doctor doctor;
        String date;

        Appointment(int appointmentId, Patient patient, Doctor doctor, String date) {
            this.appointmentId = appointmentId;
            this.patient = patient;
            this.doctor = doctor;
            this.date = date;
        }

        @Override
        public String toString() {
            return "Appointment ID: " + appointmentId +
                    " | Patient: " + patient.name +
                    " | Doctor: Dr. " + doctor.name +
                    " | Date: " + date;
        }
    }

    // ---------------------- Data Storage ----------------------

    static List<Patient> patients = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();
    static List<Appointment> appointments = new ArrayList<>();

    static int patientIdCounter = 1;
    static int doctorIdCounter = 1;
    static int appointmentIdCounter = 1;

    static Scanner sc = new Scanner(System.in);

    // ---------------------- Main Menu ----------------------

    public static void main(String[] args) {
        seedSampleData(); // optional: remove this call if you don't want demo data

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1: addPatient(); break;
                case 2: viewPatients(); break;
                case 3: dischargePatient(); break;
                case 4: addDoctor(); break;
                case 5: viewDoctors(); break;
                case 6: bookAppointment(); break;
                case 7: viewAppointments(); break;
                case 8: cancelAppointment(); break;
                case 9:
                    running = false;
                    System.out.println("Exiting Hospital Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }

    static void printMenu() {
        System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Patient");
        System.out.println("2. View All Patients");
        System.out.println("3. Discharge (Remove) Patient");
        System.out.println("4. Add Doctor");
        System.out.println("5. View All Doctors");
        System.out.println("6. Book Appointment");
        System.out.println("7. View All Appointments");
        System.out.println("8. Cancel Appointment");
        System.out.println("9. Exit");
        System.out.println("=======================================");
    }

    // ---------------------- Patient Operations ----------------------

    static void addPatient() {
        System.out.println("\n--- Add New Patient ---");
        String name = readString("Enter patient name: ");
        int age = readInt("Enter patient age: ");
        String gender = readString("Enter gender (M/F/Other): ");
        String disease = readString("Enter disease/condition: ");

        Patient p = new Patient(patientIdCounter++, name, age, gender, disease);
        patients.add(p);
        System.out.println("Patient added successfully! -> " + p);
    }
    static void viewPatients() {
        System.out.println("\n--- Patient List ---");
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
            return;
        }
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    static void dischargePatient() {
        int id = readInt("Enter Patient ID to discharge: ");
        Patient found = findPatientById(id);
        if (found != null) {
            patients.remove(found);
            // also remove related appointments
            appointments.removeIf(a -> a.patient.id == id);
            System.out.println("Patient discharged: " + found.name);
        } else {
            System.out.println("Patient not found.");
        }
    }

    static Patient findPatientById(int id) {
        for (Patient p : patients) {
            if (p.id == id) return p;
        }
        return null;
    }

    // ---------------------- Doctor Operations ----------------------

    static void addDoctor() {
        System.out.println("\n--- Add New Doctor ---");
        String name = readString("Enter doctor name: ");
        String specialization = readString("Enter specialization: ");

        Doctor d = new Doctor(doctorIdCounter++, name, specialization);
        doctors.add(d);
        System.out.println("Doctor added successfully! -> " + d);
    }

    static void viewDoctors() {
        System.out.println("\n--- Doctor List ---");
        if (doctors.isEmpty()) {
            System.out.println("No doctors registered.");
            return;
        }
        for (Doctor d : doctors) {
            System.out.println(d);
        }
    }

    static Doctor findDoctorById(int id) {
        for (Doctor d : doctors) {
            if (d.id == id) return d;
        }
        return null;
    }

    // ---------------------- Appointment Operations ----------------------

    static void bookAppointment() {
        System.out.println("\n--- Book Appointment ---");
        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println("You need at least one patient and one doctor to book an appointment.");
            return;
        }
        viewPatients();
        int patientId = readInt("Enter Patient ID: ");
        Patient p = findPatientById(patientId);
        if (p == null) {
            System.out.println("Patient not found.");
            return;
        }

        viewDoctors();
        int doctorId = readInt("Enter Doctor ID: ");
        Doctor d = findDoctorById(doctorId);
        if (d == null) {
            System.out.println("Doctor not found.");
            return;
        }

        String date = readString("Enter appointment date (DD-MM-YYYY): ");
        Appointment a = new Appointment(appointmentIdCounter++, p, d, date);
        appointments.add(a);
        System.out.println("Appointment booked successfully! -> " + a);
    }

    static void viewAppointments() {
        System.out.println("\n--- Appointment List ---");
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
            return;
        }
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }

    static void cancelAppointment() {
        int id = readInt("Enter Appointment ID to cancel: ");
        Appointment found = null;
        for (Appointment a : appointments) {
            if (a.appointmentId == id) {
                found = a;
                break;
            }
        }
        if (found != null) {
            appointments.remove(found);
            System.out.println("Appointment cancelled.");
        } else {
            System.out.println("Appointment not found.");
        }
    }

    // ---------------------- Utility / Input Helpers ----------------------

    static int readInt(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine(); // consume newline
        return value;
    }

    static String readString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    // ---------------------- Optional Demo Data ----------------------

    static void seedSampleData() {
        Doctor d1 = new Doctor(doctorIdCounter++, "Anjali Menon", "Cardiology");
        Doctor d2 = new Doctor(doctorIdCounter++, "Rahul Nair", "Orthopedics");
        doctors.add(d1);
        doctors.add(d2);

        Patient p1 = new Patient(patientIdCounter++, "Suresh Kumar", 45, "M", "Chest pain");
        patients.add(p1);
    }
}