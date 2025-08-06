package Pack1;
abstract class Account11 {
    protected String accountNumber;
    protected double balance;

    public Account11(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
    public abstract boolean withdraw(double amount);
}
class SavingsAccount1 extends Account11{
    private final double minimumBalance = 500.0;

    public SavingsAccount1(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful from Savings Account.");
            return true;
        } else {
            System.out.println("Withdrawal denied! Minimum balance of ₹" + minimumBalance + " must be maintained.");
            return false;
        }
    }
}
class CurrentAccount1 extends Account11 {
    private double overdraftLimit;

    public CurrentAccount1(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful from Current Account.");
            return true;
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
            return false;
        }
    }
}
public class Lab_22 {
	public static void main(String[] args) {
        Account11 savings = new SavingsAccount1("SAV123", 1000);
        Account11 current = new CurrentAccount1("CUR123", 1000, 500);
        System.out.println("\nSavings Account");
        savings.withdraw(400);  
        savings.withdraw(200); 
        System.out.println("\nCurrent Account");
        current.withdraw(1300);  
        current.withdraw(300);   
    }

}
