package com.exercisepdf.banksystem;

import com.exercisepdf.banksystem.model.*;
import com.exercisepdf.banksystem.model.exceptions.*;

public class BankSystem {
    public static void main(String[] args) throws AccountAlreadyAddedException, AccountNotFoundException, WithdrawException, ClientAlreadyAddedException {
        Bank bank = Bank.getBankInstance();
        System.out.println(bank.getClients());
    }

}
