package com.exercisepdf.banksystem;

import com.exercisepdf.banksystem.model.*;

public class BankSystem {
    public static void main(String[] args){
        Bank bank = Bank.getBankInstance();
        Account acc = new Account(1, 1500f);
        Client cli = new Regular(1, "omri", 0f);
        cli.addAccount(acc);
        bank.addClient(cli);
        bank.store();

    }
}
