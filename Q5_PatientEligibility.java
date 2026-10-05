import java.util.Scanner;

class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkEligibility() {
        if (age >= 18)
            System.out.println(name + " is eligible for adult treatment.");
        else
            System.out.println(name + " is eligible for pediatric treatment.");
    }
}

public class Q5_PatientEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter patient age: ");
        int age = sc.nextInt();

        Patient patient = new Patient(name, age);

        patient.checkEligibility();

        sc.close();
    }
}