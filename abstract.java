abstract class Account
{
int accountNumber;
String accountHolder;
double balance;

Account(int accountNumber, String accountHolder, double balance)
{
this.accountNumber = accountNumber;
this.accountHolder = accountHolder;
this.balance = balance;
}

abstract void calculateInterest();
abstract void deposit(double amount);
abstract void withdraw(double amount);

void display()
{
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolder);
System.out.println("Balance: " + balance);
}
}

class SavingsAccount extends Account
{
double minBalance = 1000;
double interestRate = 5.0;

SavingsAccount(int accNo, String name, double balance)
{
super(accNo, name, balance);
}

void deposit(double amount)
{
balance += amount;
System.out.println("Deposited: " + amount);
}

void withdraw(double amount)
{
if (balance - amount >= minBalance)
{
balance -= amount;
System.out.println("Withdrawn: " + amount);
}
else
{
System.out.println("Minimum balance requirement not maintained!");
}
}

void calculateInterest()
{
double interest = balance * interestRate / 100;
System.out.println("Interest: " + interest);
}
}

class CurrentAccount extends Account
{
double overdraftLimit = 5000;
double interestRate = 2.0;

CurrentAccount(int accNo, String name, double balance)
{
super(accNo, name, balance);
}

void deposit(double amount)
{
balance += amount;
System.out.println("Deposited: " + amount);
}

void withdraw(double amount)
{
if (balance + overdraftLimit >= amount)
{
balance -= amount;
System.out.println("Withdrawn: " + amount);
}
else
{
System.out.println("Overdraft limit exceeded!");
}
}

void calculateInterest()
{
double interest = balance * interestRate / 100;
System.out.println("Interest: " + interest);
}
}

public class Bank
{
public static void main(String[] args)
{
SavingsAccount sa = new SavingsAccount(101, "Virat", 5000);
sa.deposit(1000);
sa.withdraw(3000);
sa.calculateInterest();
sa.display();

CurrentAccount ca = new CurrentAccount(102, "Rohit", 2000);
ca.deposit(2000);
ca.withdraw(6000);
ca.calculateInterest();
ca.display();
}
}
