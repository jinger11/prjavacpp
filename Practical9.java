/*
Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
*/

// Base class: BankAccount
class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    // Constructor
    public SavingsAccount(String accountHolderName, double initialBalance) {
        super(accountHolderName, initialBalance);
    }

    // Overriding the withdraw method
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Withdrawal denied. Balance cannot fall below ₹100.");
        } else {
            super.withdraw(amount);
        }
    }
}

// Main class
public class Practical9 {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount account = new SavingsAccount("John Doe", 500);

        // Perform some operations
        account.deposit(200);
        account.withdraw(550); // Withdrawal denied
        account.withdraw(50);  // Successful withdrawal
    }
}
