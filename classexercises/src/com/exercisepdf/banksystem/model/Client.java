package com.exercisepdf.banksystem.model;

import java.util.ArrayList;
import java.util.Objects;
import com.exercisepdf.banksystem.model.exceptions.AccountAlreadyAddedException;
import com.exercisepdf.banksystem.model.exceptions.AccountNotFoundException;
import com.exercisepdf.banksystem.model.exceptions.WithdrawException;

public abstract class Client {
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

    public Account getAccount(Integer id){
        Account account = null;
        for(Account acc: this.accounts){
            if(id == acc.getId()){
                account = acc;
            }
        }
        return account;
    }

    public void deposit(Float amount){
        Float commission = amount * this.commissionRate;
        this.balance += (amount - commission);
        Bank.updateTotalCommission(commission);
    }

    public void withdraw(Float amount) throws WithdrawException {
        Float commission = amount * this.commissionRate;
        Float total = amount + commission;
        if(this.balance - total < 0){
            throw new WithdrawException("Cannot withdraw - balance too low", this.id, this.balance, total);
        }
        this.balance -= total;
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
