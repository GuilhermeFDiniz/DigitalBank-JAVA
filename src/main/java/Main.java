public class Main {

    public static void main(String[] args) {


        Bank bandoDoBrasil = new Bank("Banco do Brasil");
        Bank bandoBradesco = new Bank("Banco Bradesco");
        bandoDoBrasil.bankInfo();
        bandoBradesco.bankInfo();
        Client gui = new Client("Guilherme", "Araguari", "(34)988023241", "guidinizeng@gmail.com", 30, 1);
        Client jana = new Client("Janaina", "Araçatuba", "(34)992354123", "janainafmedeiros@bol.com", 27, 2 );
        Account cc = new CurrentAccount(gui);
        Account cp = new SavingsAccount(jana);
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
