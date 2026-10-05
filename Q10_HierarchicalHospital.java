class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
    }
}

class Doctor extends Employee {
    String specialization;

    Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    String qualification;

    Pharmacist(String name, String qualification) {
        super(name);
        this.qualification = qualification;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Qualification: " + qualification);
    }
}

public class Q10_HierarchicalHospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Rahul", "Cardiology");
        Pharmacist pharmacist = new Pharmacist("Amit", "B.Pharm");

        doctor.displayDoctor();

        System.out.println();

        pharmacist.displayPharmacist();
    }
}