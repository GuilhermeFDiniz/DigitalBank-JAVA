public class SavingsAccount extends Account{

    public SavingsAccount(Client clientAccount) {
        super.clientAccount = clientAccount;
        super.bankOffice = DEFAULT_ROUTING_NUMBER;
        super.accountNumber = ACCOUNT_ID;
    }

    @Override
    public void bankStatement(){
        System.out.println(String.format
                (" ________________________________\n"
                +"| Savings Account Bank Statement |" +
                "\n --------------------------------"));
        super.bankStatement();
    }




}
