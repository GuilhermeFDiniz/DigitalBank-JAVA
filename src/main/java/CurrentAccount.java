public class CurrentAccount extends Account{

@Override
    public void bankstatement(){
    System.out.println(String.format(" ________________________________\n" +
            "| Current Account Bank Statement |" +
            "\n --------------------------------"));
    super.bankstatement();
}


}
