import java.util.Scanner;

public class Account {
    private double balance;

    // Constructor to initialize balance
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the initial balance
        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();

        // Create an instance of the Account class with the initial balance
        Account myAccount = new Account(initialBalance);

        // Prompt the user to input the deposit amount
        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();

        // Deposit the specified amount
        myAccount.deposit(depositAmount);

        // Prompt the user to input the withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = input.nextDouble();

        // Withdraw the specified amount
        myAccount.withdraw(withdrawalAmount);

        // Print the current balance
        System.out.println("Current balance: " + myAccount.getBalance());

        // Close the Scanner object
        input.close();
    }
}
