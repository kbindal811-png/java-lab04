class MedicineStock {
    String name;
    int quantity;

    MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Medicine: " + name + ", Quantity: " + quantity);
    }
}

class Inventory {
    MedicineStock[] medicines;

    Inventory() {
        medicines = new MedicineStock[3];

        medicines[0] = new MedicineStock("Paracetamol", 50);
        medicines[1] = new MedicineStock("Amoxicillin", 30);
        medicines[2] = new MedicineStock("Cetirizine", 40);
    }

    void displayInventory() {
        System.out.println("Pharmacy Inventory:");

        for (MedicineStock medicine : medicines) {
            medicine.display();
        }
    }
}

public class Q4_PharmacyInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.displayInventory();
    }
}