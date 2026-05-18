// Abstract Class
abstract class Account {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    // Constructor
    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract Method
    public abstract void calculateInterest();

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Common Method
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount Class
class SavingsAccount extends Account {
    private final double MIN_BALANCE = 1000;
    private final double INTEREST_RATE = 0.05;

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance must be maintained!");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}

// CurrentAccount Class
class CurrentAccount extends Account {
    private final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Account savings = new SavingsAccount(101, "Pranjali", 5000);
        Account current = new CurrentAccount(102, "Rahul", 2000);

        System.out.println("\n--- Savings Account ---");
        savings.deposit(1000);
        savings.withdraw(2000);
        savings.calculateInterest();
        savings.display();

        System.out.println("\n--- Current Account ---");
        current.deposit(2000);
        current.withdraw(6000);
        current.calculateInterest();
        current.display();
    }
}