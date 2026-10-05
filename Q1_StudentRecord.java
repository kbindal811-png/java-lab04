import java.util.Scanner;

class Student {
    String name;
    int rollNumber;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Q1_StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        student.rollNumber = sc.nextInt();

        student.display();

        sc.close();
    }
}