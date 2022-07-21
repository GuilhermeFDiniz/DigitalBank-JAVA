public class SavingsAccount extends Account{

    @Override
    public void bankstatement(){
        System.out.println(String.format(" ________________________________\n" +
                "| Savings Account Bank Statement |" +
                "\n --------------------------------"));
        super.bankstatement();
    }




}
