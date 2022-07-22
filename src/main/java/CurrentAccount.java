public class CurrentAccount extends Account{


    @Override
    public void bankStatement(){
    System.out.println(String.format
                    (" ________________________________\n"
                    + "| Current Account Bank Statement |" +
                     "\n --------------------------------"));
    super.bankStatement();
}


}
