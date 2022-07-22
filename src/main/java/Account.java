import java.util.*;
import java.io.*;
import java.lang.*;

public abstract class Account implements AccountInterface{
    protected static final int DEFAULT_ROUTING_NUMBER = 1;
    protected static int ACCOUNT_ID = 1;

    protected int bankOffice;
    protected int accountNumber;
    protected double balance;
    protected List<String> statementList = new ArrayList<String>();



    public Account() {
        this.accountNumber = ACCOUNT_ID++;
        this.bankOffice = Account.DEFAULT_ROUTING_NUMBER;

    }

    public int getBankOffice() {
        return bankOffice;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }




    @Override
    public void withdraw(double value) {
        if(this.balance - value <0){
            System.out.println("You cannot withdraw this amount.");
        } else {
            balance -= value;
            statementList.add("Withdrew: "+ value);
        }
    }

    @Override
    public void deposit(double value) {
        balance += value;
        statementList.add("Deposited "+ value);
    }

    @Override
    public void transfer(double value, Account accountRecipient) {
        if(this.balance - value <0){
            System.out.println("You cannot transfer this amount.");
        } else {
            balance -= value;
            accountRecipient.transferRecipient(value);
            statementList.add("Transfered to : "+ value);
        }
    }

    public void transferRecipient(double value){
        balance += value;
        statementList.add("Transference from :"+ value);

    }

    @Override
    public void bankStatement() {
        System.out.println(String.format("Bank Office: %d", this.getBankOffice()));
        System.out.println(String.format("Account Number: %d", this.getAccountNumber()));
        System.out.println(String.format("Balance: %.2f", this.getBalance()));
        System.out.println(this.statementList);
    }

}
