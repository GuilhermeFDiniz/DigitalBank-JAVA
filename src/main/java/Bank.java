public class Bank {

    private String name;
    private int bankId;
    private Client clients;

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

    public Client getClients() {
        return clients;
    }
}
