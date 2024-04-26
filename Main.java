public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.0, 0.05);

        System.out.println("Initial Details:");
        System.out.println(savingsAccount);

        System.out.println("\nDepositing $500...");
        savingsAccount.deposit(500.0);
        System.out.println("New Details:");
        System.out.println(savingsAccount);

        System.out.println("\nWithdrawing $200...");
        savingsAccount.withdraw(200.0);
        System.out.println("New Details:");
        System.out.println(savingsAccount);

        System.out.println("\nAdding interest...");
        savingsAccount.addInterest();
        System.out.println("New Details:");
        System.out.println(savingsAccount);
    }
}
