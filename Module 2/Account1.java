import java.util.Scanner;

public class Account1 {
    private double balance;

    // Constructor to initialize balance
    public Account1(double initialBalance) {
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
        Account1 myAccount = new Account1(initialBalance);

        // Menu system
        int choice = 0;
        while (choice != 4) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = input.nextDouble();
                    myAccount.withdraw(withdrawalAmount);
                    break;

                case 3:
                    System.out.println("Current balance: " + myAccount.getBalance());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        // Close the Scanner object
        input.close();
    }
}
