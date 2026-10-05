import java.util.Scanner;

class PatientBill {
    private double consultationFee;
    private double medicineFee;
    private double testFee;

    void setConsultationFee(double fee) {
        consultationFee = fee;
    }

    void setMedicineFee(double fee) {
        medicineFee = fee;
    }

    void setTestFee(double fee) {
        testFee = fee;
    }

    double calculateTotal() {
        return consultationFee + medicineFee + testFee;
    }

    void displayBill() {
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Fee: " + medicineFee);
        System.out.println("Test Fee: " + testFee);
        System.out.println("Total Bill: " + calculateTotal());
    }
}

public class Q8_PatientBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PatientBill bill = new PatientBill();

        System.out.print("Enter consultation fee: ");
        bill.setConsultationFee(sc.nextDouble());

        System.out.print("Enter medicine fee: ");
        bill.setMedicineFee(sc.nextDouble());

        System.out.print("Enter test fee: ");
        bill.setTestFee(sc.nextDouble());

        bill.displayBill();

        sc.close();
    }
}