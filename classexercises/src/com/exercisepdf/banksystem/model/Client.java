package com.exercisepdf.banksystem.model;

import java.util.ArrayList;
import java.util.Objects;
import com.exercisepdf.banksystem.exceptions.AccountAlreadyAddedException;
import com.exercisepdf.banksystem.exceptions.AccountNotFoundException;

public class Client {
    private int id;
    private String name;
    private float balance;
    private ArrayList<Account> accounts;
    private float commissionRate = 0;
    private float interestRate = 0;
    private Logger logger;


    public Client(int id, String name, float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.accounts = new ArrayList<>();
        this.logger = new Logger("");
    }

    public void addAccount(Account account) throws AccountAlreadyAddedException {
        boolean foundAccount = false;
        for(Account acc: this.accounts){
            if(account.equals(acc)){
                foundAccount = true;
                break;
            }
        }
        if(foundAccount){
            throw new AccountAlreadyAddedException(account.getId());
        } else {
            this.accounts.add(account);
            logger.log(new Log(this.id, String.format("client update - added account %d to accounts", id), 0f));
        }
    }

    public void removeAccount(int id) throws AccountNotFoundException {
        Account account = null;
        for(Account acc: this.accounts){
            if(id == acc.getId()){
                account = acc;
                break;
            }
        }
        if(account == null){
            throw new AccountNotFoundException(id);
        } else {
            this.accounts.remove(account);
            logger.log(new Log(this.id, String.format("client update - removed account %d from accounts", id), 0f));
        }
    }

    public Account getAccount(int id){
        Account account = null;
        for(Account acc: this.accounts){
            if(id == acc.getId()){
                account = acc;
            }
        }
        return account;
    }

    public void deposit(float amount){
        this.balance += (amount - this.commissionRate);
    }

    public void withdraw(float amount){
        this.balance += (amount + this.commissionRate);
    }

    public void autoUpdateAccounts(){
        for(Account acc: this.accounts){
            acc.setBalance(acc.getBalance() * this.interestRate);
        }
    }

    public float getFortune(){
        float grandTotal = this.balance;
        for(Account acc: this.accounts){
            grandTotal += acc.getBalance();
        }
        return grandTotal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
