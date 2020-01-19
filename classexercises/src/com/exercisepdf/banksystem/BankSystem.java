package com.exercisepdf.banksystem;

import com.exercisepdf.banksystem.model.Account;
import com.exercisepdf.banksystem.model.Bank;
import com.exercisepdf.banksystem.model.Client;
import com.exercisepdf.banksystem.model.Regular;
import com.exercisepdf.banksystem.model.exceptions.AccountAlreadyAddedException;
import com.exercisepdf.banksystem.model.exceptions.AccountNotFoundException;
import com.exercisepdf.banksystem.model.exceptions.ClientAlreadyAddedException;

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = Bank.getBankInstance();


        Client client = new Regular(1001, "client1", 0);
        Account account = new Account(2001, 0);
        account.setBalance(100);
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

        System.out.println(bank.getBalance());
        try {
            bank.addClient(client);
        } catch (ClientAlreadyAddedException e) {
            e.printStackTrace();
        }
        System.out.println(bank.getBalance());







    }

}
