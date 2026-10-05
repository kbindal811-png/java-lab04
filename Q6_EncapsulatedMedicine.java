class MedicineProduct {
    private String name;
    private double price;

    MedicineProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Medicine Name: " + name);
        System.out.println("Medicine Price: " + price);
    }
}

public class Q6_EncapsulatedMedicine {
    public static void main(String[] args) {
        MedicineProduct medicine = new MedicineProduct("Vitamin C", 120);

        medicine.display();
    }
}