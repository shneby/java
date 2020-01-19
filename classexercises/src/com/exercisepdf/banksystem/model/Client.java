package com.exercisepdf.banksystem.model;

import java.util.ArrayList;
import java.util.Objects;
import com.exercisepdf.banksystem.model.exceptions.AccountAlreadyAddedException;
import com.exercisepdf.banksystem.model.exceptions.AccountNotFoundException;

public abstract class Client {
    private int id;
    private String name;
    private float balance;
    private ArrayList<Account> accounts;
    protected final float commissionRate;
    protected final float interestRate;


    public Client(int id, String name, float balance, float commissionRate, float interestRate) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.commissionRate = commissionRate;
        this.interestRate = interestRate;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) throws AccountAlreadyAddedException {
        boolean foundAccount = false;
        for(Account acc: this.accounts){
            if(acc.equals(account)){
                foundAccount = true;
                break;
            }
        }
        if(foundAccount){
            throw new AccountAlreadyAddedException(id);
        } else {
            this.accounts.add(account);
            Logger.log(new Log(this.id, String.format("client update - added account %d to accounts", account.getId()), 0f));
        }
    }

    public void removeAccount(Account account) throws AccountNotFoundException {
        boolean foundAccount = false;
        for(Account acc: this.accounts){
            if(acc.equals(account)){
                foundAccount = true;
                break;
            }
        }
        if(foundAccount){
            this.balance += account.getBalance();
            this.accounts.remove(account);
            Logger.log(new Log(this.id, String.format("client update - removed account %d from accounts", account.getId()), 0f));

        } else {
            throw new AccountNotFoundException(id);
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
        float commission = amount * this.commissionRate;
        this.balance += (amount - commission);
        Bank.updateTotalCommission(commission);
    }

    public void withdraw(float amount){
        float commission = amount * this.commissionRate;
        this.balance -= (amount + commission);
        Bank.updateTotalCommission(commission);
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
