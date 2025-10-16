package Chapter45.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int accountNumber;
    private String owner;
    private float balance;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if(balance >= 0) {
            this.balance = balance;
        }else throw new RuntimeException("Balance cannot be negative");
    }

    public void withdraw(BankAccount bankAccount, float amount) {
        if (amount > bankAccount.getBalance()) {
            System.out.println("Insufficient funds!");
        } else {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
        }
    }

    public void deposit(BankAccount bankAccount, float amount) {
        if (amount >= 0) {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
        } else{
            System.out.println("Amount cannot be negative!");
        };
    }

    public List<BankAccount> populateBankAccounts() {
        List<BankAccount> accounts = new ArrayList<>();
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(1);
        account1.setBalance(500);
        account1.setOwner("Vlad");
        BankAccount account2 = new BankAccount();
        account2.setAccountNumber(2);
        account2.setBalance(500);
        account2.setOwner("Radu");
        BankAccount account3 = new BankAccount();
        account3.setAccountNumber(3);
        account3.setBalance(500);
        account3.setOwner("Cristian");
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        return accounts;

    }

    public BankAccount createAccount(int accountNumber, String owner, float balance) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(accountNumber);
        bankAccount.setOwner(owner);
        bankAccount.setBalance(balance);
        return bankAccount;
    }
}
