import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Q7_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(5000);

        System.out.println("Initial Balance: 5000");

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);
        account.displayBalance();

        sc.close();
    }
}