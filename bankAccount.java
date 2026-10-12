public class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}