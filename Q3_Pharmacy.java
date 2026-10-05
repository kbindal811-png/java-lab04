class Pharmacy {
    static String pharmacyName = "MediCare Pharmacy";
    String location;

    Pharmacy(String location) {
        this.location = location;
    }

    void display() {
        System.out.println("Pharmacy Name: " + pharmacyName);
        System.out.println("Location: " + location);
    }
}

public class Q3_Pharmacy {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("Haridwar");
        Pharmacy p2 = new Pharmacy("Roorkee");

        p1.display();
        System.out.println();

        p2.display();

        System.out.println();
        System.out.println("Static value is shared by both objects.");
    }
}