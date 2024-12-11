/*
14. Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
*/
import java.util.ArrayList;
import java.util.List;

// Account Interface with common methods for bank accounts
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    double getBalance();
}

// SavingsAccount class implementing the Account interface
class SavingsAccount implements Account {
    private double balance;
    private double interestRate = 0.04;  // 4% interest rate

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in Savings Account.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added to Savings Account.");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// CurrentAccount class implementing the Account interface
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit = 1000.00;  // Overdraft limit for Current Account

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > (balance + overdraftLimit)) {
            System.out.println("Insufficient funds in Current Account, even with overdraft.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account.");
        }
    }

    @Override
    public void calculateInterest() {
        // Current Account does not have interest, so no interest is calculated
        System.out.println("Current Account does not earn interest.");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Bank class to manage multiple accounts
class Bank {
    private List<Account> accounts = new ArrayList<>();

    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to the bank.");
    }

    // Method to display all account balances
    public void displayBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }
}

// Main class to test the banking system
public class Practical14 {
    public static void main(String[] args) {
        // Create Bank instance
        Bank bank = new Bank();

        // Create different types of accounts
        SavingsAccount savingsAccount = new SavingsAccount(5000.00);
        CurrentAccount currentAccount = new CurrentAccount(2000.00);

        // Add accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Perform operations on the Savings Account
        savingsAccount.deposit(1500.00);
        savingsAccount.withdraw(2000.00);
        savingsAccount.calculateInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Perform operations on the Current Account
        currentAccount.deposit(1000.00);
        currentAccount.withdraw(3000.00);
        currentAccount.calculateInterest();
        System.out.println("Current Account Balance: " + currentAccount.getBalance());

        // Display all account balances in the bank
        bank.displayBalances();
    }
}

