public class SavingsAccount extends Account{

    @Override
    public void bankStatement(){
        System.out.println(String.format
                (" ________________________________\n"
                +"| Savings Account Bank Statement |" +
                "\n --------------------------------"));
        super.bankStatement();
    }




}
