class Hospital {
    static String hospitalName = "City Care Hospital";
}

class Staff {
    private String name;
    private double salary;

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    void display() {
        System.out.println("Staff Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Doctor extends Staff {
    private String specialization;

    Doctor(String name, double salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Doctor: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends Staff {
    private String qualification;

    Pharmacist(String name, double salary, String qualification) {
        super(name, salary);
        this.qualification = qualification;
    }

    void display() {
        System.out.println("Pharmacist: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Qualification: " + qualification);
    }
}

class HospitalSystem {
    private Staff[] staff;

    HospitalSystem() {
        staff = new Staff[3];

        staff[0] = new Doctor("Dr. Rahul", 80000, "Cardiology");
        staff[1] = new Pharmacist("Amit", 35000, "B.Pharm");
        staff[2] = new Doctor("Dr. Neha", 75000, "Pediatrics");
    }

    void displaySystem() {
        System.out.println("Hospital: " + Hospital.hospitalName);
        System.out.println();

        for (Staff member : staff) {
            member.display();
            System.out.println();
        }
    }
}

public class Q15_HospitalStaffSystem {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();

        system.displaySystem();
    }
}