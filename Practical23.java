/*
23. Using concepts of Object-Oriented programming develop solution for an application 1) Banking system having following operations : 1. Create an account 2. Deposit money 3. Withdraw money 4. Honor daily withdrawal limit 5. Check the balance 6. Display Account information.
*/

import java.util.Scanner;

// Class to represent a Bank Account
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private static final double DAILY_WITHDRAWAL_LIMIT = 50000; // Example withdrawal limit

    // Constructor to initialize the bank account
    public BankAccount(int accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money with honor for daily withdrawal limit
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else if (amount > DAILY_WITHDRAWAL_LIMIT) {
            System.out.println("Cannot withdraw more than ₹" + DAILY_WITHDRAWAL_LIMIT + " in a day.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + ". New balance: ₹" + balance);
        }
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Main Class
public class Practical23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an account
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ₹");
        double initialDeposit = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialDeposit);

        // Menu-driven system for banking operations
        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Account is created during object instantiation, so no need to recreate it here.
                    System.out.println("Account already created.");
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 4:
                    account.checkBalance();
                    break;

                case 5:
                    account.displayAccountInfo();
                    break;

                case 6:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
