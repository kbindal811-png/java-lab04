class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Pharmacist extends Employee {
    String qualification;

    Pharmacist(String name, double salary, String qualification) {
        super(name, salary);
        this.qualification = qualification;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Qualification: " + qualification);
    }
}

public class Q9_EmployeePharmacist {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(
            "Amit",
            35000,
            "B.Pharm"
        );

        pharmacist.displayPharmacist();
    }
}