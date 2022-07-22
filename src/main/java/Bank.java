import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static int BANKID=1;
    private String name;
    private int bankId;

    public Bank(String name) {
        this.name = name;
        this.bankId = BANKID++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    public String getName() {
        return name;
    }

    public int getBankId() {
        return bankId;
    }


    public void bankInfo(){
        System.out.println("Bank name: " + this.getName());
        System.out.println("Bank name: " + this.getBankId());
    }

}
