abstract class BankAccount {
    double balance = 10000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    abstract void calculateInterest();
}
class SavingsAccount extends BankAccount {
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Savings Account Interest: " + interest);
    }
}
class CurrentAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Current Account has no interest.");
    }
}

public class BankAccounts {
    public static void main(String[] args) {

        BankAccount b1 = new SavingsAccount();
        b1.deposit(2000);
        b1.withdraw(1000);
        b1.calculateInterest();

        BankAccount b2 = new CurrentAccount();
        b2.deposit(3000);
        b2.withdraw(500);
        b2.calculateInterest();
    }
}