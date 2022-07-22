public class Main {

    public static void main(String[] args) {
        Account cc = new CurrentAccount();
        Account cp = new SavingsAccount();
        cc.withdraw(500);
        cc.transfer(500,cp);
        cp.deposit(500);
        cp.deposit(100);
        cp.transfer(200,cc);
        cp.transfer(200,cc);
        cp.withdraw(300);
        cc.bankStatement();
        cp.bankStatement();

    }
}
