package Hospital_oops;

import java.util.Scanner;

public class hospital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the person name");
        String person_name = sc.next();

        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.println("Enter the Gender");
        String gender = sc.next();

        // Create a person object and output details
        person_name p = new person_name(person_name, age, gender);
        p.personOutput();

        System.out.println("Enter the speciality");
        String speciality = sc.next();

        // Create a doctor object and output details
        doctor d = new doctor(person_name, age, gender, speciality);
        d.doctorOutput();

        System.out.println("Enter the disease");
        String disease = sc.next();

        // Create a patient object and output details
        patient pat = new patient(person_name, age, gender, disease);
        pat.patientOutput();

        System.out.println("Enter the room number");
        int roomNo = sc.nextInt();

        // Create a nurse object and output details
        nurse n = new nurse(person_name, age, gender, roomNo);
        n.roomnoOutput();
    }
}
