

public class Client {

    private String name;
    private String adress;
    private String phoneNumber;
    private String email;
    private int clientAge;


    public Client(String name, String adress, String phoneNumber, int clientAge) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.clientAge = clientAge;
    }

    public Client(String name, String adress, String phoneNumber, String email, int clientAge) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.clientAge = clientAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getClientAge() {
        return clientAge;
    }
}
