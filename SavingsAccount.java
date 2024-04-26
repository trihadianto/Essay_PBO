public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Added interest: $" + (balance * interestRate));
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterest Rate: " + (interestRate * 100) + "%";
    }
}
