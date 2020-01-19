package com.exercisepdf.banksystem;

import com.exercisepdf.banksystem.model.Account;
import com.exercisepdf.banksystem.model.Bank;
import com.exercisepdf.banksystem.model.Client;
import com.exercisepdf.banksystem.model.Regular;
import com.exercisepdf.banksystem.model.exceptions.AccountAlreadyAddedException;
import com.exercisepdf.banksystem.model.exceptions.AccountNotFoundException;
import com.exercisepdf.banksystem.model.exceptions.ClientAlreadyAddedException;
import com.exercisepdf.banksystem.model.exceptions.WithdrawException;

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = Bank.getBankInstance();


        Client client = new Regular(1001, "client1", 0f);
        Account account = new Account(2001, 0f);
        account.setBalance(100f);
        try {
            client.addAccount(account);
        } catch (AccountAlreadyAddedException e) {
            e.printStackTrace();
        }

        System.out.println(client.getBalance());
        try{
            client.removeAccount(account);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(client.getBalance());

        try{
            client.withdraw(10f);
        } catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(bank.getBalance());
        try {
            bank.addClient(client);
        } catch (ClientAlreadyAddedException e) {
            e.printStackTrace();
        }
        System.out.println(bank.getBalance());
    }

}
