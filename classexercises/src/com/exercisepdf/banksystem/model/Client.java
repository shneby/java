package com.exercisepdf.banksystem.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import com.exercisepdf.banksystem.model.exceptions.WithdrawException;

public abstract class Client implements Serializable {
    private Integer id;
    private String name;
    private Float balance;
    private ArrayList<Account> accounts;
    protected final Float commissionRate;
    protected final Float interestRate;


    public Client(Integer id, String name, Float balance, Float commissionRate, Float interestRate) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.commissionRate = commissionRate;
        this.interestRate = interestRate;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        if(accounts.contains(account)){
            Logger.log(id, "Account already exists - id: " + account.getId());
        } else {
            this.accounts.add(account);
            Logger.log(id, "Added account id: " + account.getId());
        }
    }

    public void removeAccount(Account account) {
        if(accounts.contains(account)){
            balance += account.getBalance();
            accounts.remove(account);
            Logger.log(id, "Removed account id: " + account.getId());
        } else {
            Logger.log(id, "Account not found - id: " + account.getId());
        }
    }

    public Account getAccount(Integer id){
        Account account = null;
        for(Account acc: this.accounts){
            if(id.equals(acc.getId())){
                account = acc;
            }
        }
        return account;
    }

    public void deposit(Float amount){
        float commission = amount * this.commissionRate;
        this.balance += (amount - commission);
        Bank.updateTotalCommission(commission);
    }

    public void withdraw(Float amount) throws WithdrawException {
        float commission = amount * this.commissionRate;
        Float total = amount + commission;
        if(this.balance - total < 0){
            throw new WithdrawException("Cannot withdraw - balance too low", this.id, this.balance, total);
        }
        this.balance -= total;
        Bank.updateTotalCommission(commission);
    }

    public void autoUpdateAccounts(){
        for(Account acc: accounts){
            acc.setBalance(acc.getBalance() * interestRate);
        }
    }

    public float getFortune(){
        float grandTotal = balance;
        for(Account acc: accounts){
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

    public void setBalance(Float balance) {
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
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
