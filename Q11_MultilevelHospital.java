class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class Q11_MultilevelHospital {
    public static void main(String[] args) {
        Manager manager = new Manager(
            "Neha",
            60000,
            "Hospital Administration"
        );

        manager.displayManager();
    }
}