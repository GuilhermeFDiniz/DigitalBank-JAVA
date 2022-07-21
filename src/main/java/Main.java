public class Main {

    public static void main(String[] args) {
        Account cc = new CurrentAccount();
        Account cp = new SavingsAccount();

        cc.bankstatement();
        cp.bankstatement();

    }
}
