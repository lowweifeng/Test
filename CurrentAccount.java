public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, String accountHolderName, double overdraftLimit) {
        super(accountNumber, balance, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            if (amount > getBalance()) {
                double overdraftFee = amount * 0.03;
                super.withdraw(amount);
                overdraftLimit -= overdraftFee;
            } else {
                super.withdraw(amount);
            }
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
