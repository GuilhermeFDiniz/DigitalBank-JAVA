public abstract class Account implements AccountInterface{
    private static final int DEFAULT_ROUTING_NUMBER = 1;
    private static int ACCOUNT_ID = 1;

    protected int bankoffice;
    protected int accountnumber;
    protected double balance;


    public Account() {
        this.accountnumber = ACCOUNT_ID++;
        this.bankoffice = Account.DEFAULT_ROUTING_NUMBER;
    }

    public int getBankoffice() {
        return bankoffice;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account accountRecipient) {
        balance -= value;
        accountRecipient.deposit(value);
    }

    @Override
    public void bankstatement() {
        System.out.println(String.format("Bank Office: %d", this.getBankoffice()));
        System.out.println(String.format("Account Number: %d", this.getAccountnumber()));
        System.out.println(String.format("Balance: %.2f", this.getBalance()));
    }

}
