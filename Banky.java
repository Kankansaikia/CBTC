import java.io.*;
import java.util.*;

// Class representing a bank account
class Account implements Serializable {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Methods to deposit and withdraw funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Class representing the bank system
class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    // Create a new account
    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account with this number already exists.");
        } else {
            Account newAccount = new Account(accountNumber, accountHolderName, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created successfully.");
        }
    }

    // Get an account by account number
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    // Deposit to an account
    public void depositToAccount(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw from an account
    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Transfer between accounts
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = accounts.get(fromAccountNumber);
        Account toAccount = accounts.get(toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            if (fromAccount.getBalance() >= amount) {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Transferred " + amount + " from " + fromAccountNumber + " to " + toAccountNumber);
            } else {
                System.out.println("Insufficient funds in the source account.");
            }
        } else {
            System.out.println("One or both accounts not found.");
        }
    }

    // Display all accounts
    public void displayAllAccounts() {
        for (Account account : accounts.values()) {
            account.displayAccountInfo();
            System.out.println("-------------------------");
        }
    }
}

// Main class with user interface
public class Banky{
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanky - Simple Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(accountNumber, accountHolderName, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.depositToAccount(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdrawFromAccount(accountNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter source account number: ");
                    String fromAccountNumber = scanner.nextLine();
                    System.out.print("Enter destination account number: ");
                    String toAccountNumber = scanner.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    bank.transfer(fromAccountNumber, toAccountNumber, transferAmount);
                    break;
                case 5:
                    bank.displayAllAccounts();
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
