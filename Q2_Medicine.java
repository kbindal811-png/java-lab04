import java.util.Scanner;

class Medicine {
    String name;
    double price;

    Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Medicine Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Q2_Medicine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter medicine name: ");
        String name = sc.nextLine();

        System.out.print("Enter medicine price: ");
        double price = sc.nextDouble();

        Medicine medicine = new Medicine(name, price);

        medicine.display();

        sc.close();
    }
}