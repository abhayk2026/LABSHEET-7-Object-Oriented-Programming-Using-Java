class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) { super(message); }
}
class BankAccount {
    private double balance;
    BankAccount(double balance) { this.balance = balance; }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative.");
        if (amount > balance) throw new InsufficientFundsException("Insufficient account balance.");
        balance -= amount;
        System.out.printf("Withdrawal successful. Balance: %.2f%n", balance);
    }
}
public class BankExceptionsDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        try { account.withdraw(700.0); }
        catch (InsufficientFundsException e) { System.out.println(e.getMessage()); }
        catch (IllegalArgumentException e) { System.out.println("Invalid amount: " + e.getMessage()); }
        try { account.withdraw(-10.0); }
        catch (InsufficientFundsException e) { System.out.println(e.getMessage()); }
        catch (IllegalArgumentException e) { System.out.println("Invalid amount: " + e.getMessage()); }
    }
}
