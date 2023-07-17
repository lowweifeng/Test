// Example usage and testing
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234567890", 1000.0, "John Doe");
        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        bankAccount.displayAccountInfo();

        SavingAccount savingAccount = new SavingAccount("0987654321", 2000.0, "Jane Smith", 2.5);
        savingAccount.calculateInterest();
        savingAccount.displayAccountInfo();

        CurrentAccount currentAccount = new CurrentAccount("5678901234", 500.0, "Alice Johnson", 1000.0);
        currentAccount.withdraw(800.0);
        currentAccount.displayAccountInfo();

        // Additional testing
        System.out.println("--------------------");
        System.out.println("Additional Testing");
        System.out.println("--------------------");

        // Accessing attributes through getter methods
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Account Balance: " + bankAccount.getBalance());
        System.out.println("Account Holder: " + bankAccount.getAccountHolderName());

        // Trying to withdraw more than the available balance
        bankAccount.withdraw(1500.0);

        // Trying to withdraw from CurrentAccount beyond overdraft limit
        currentAccount.withdraw(200.0);

        // Displaying overdraft limit
        System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());

        // Depositing into SavingAccount and calculating interest
        savingAccount.deposit(1000.0);
        savingAccount.calculateInterest();
        savingAccount.displayAccountInfo();
    }
}
