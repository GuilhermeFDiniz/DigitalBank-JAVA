public class CurrentAccount extends Account{

    public CurrentAccount(Client clientAccount) {
        super.clientAccount = clientAccount;
        super.bankOffice = DEFAULT_ROUTING_NUMBER;
        super.accountNumber = ACCOUNT_ID;
    }

    @Override
    public void bankStatement(){
    System.out.println(String.format
                    (" ________________________________\n"
                    + "| Current Account Bank Statement |" +
                     "\n --------------------------------"));
    super.bankStatement();
}


}
