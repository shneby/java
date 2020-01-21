package com.exercisepdf.banksystem;

import com.exercisepdf.banksystem.model.*;
import com.exercisepdf.banksystem.model.exceptions.*;

public class BankSystem {
    public static void main(String[] args) throws AccountAlreadyAddedException, AccountNotFoundException, WithdrawException, ClientAlreadyAddedException {
        Bank bank = Bank.getBankInstance();
        Client client = new Regular(1001, "client1", 0f);
        Account account = new Account(2001, 0f);

        account.setBalance(100f);
        client.addAccount(account);
        System.out.println(client.getBalance());
        client.removeAccount(account);
        System.out.println(client.getBalance());
        client.withdraw(10f);
        System.out.println(bank.getBalance());
        bank.addClient(client);
        System.out.println(bank.getBalance());
    }

}
