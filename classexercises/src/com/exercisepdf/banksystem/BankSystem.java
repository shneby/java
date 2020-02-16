package com.exercisepdf.banksystem;

import com.exercisepdf.banksystem.model.*;

public class BankSystem {
    public static void main(String[] args){
        Bank bank = Bank.getBankInstance();
        bank.store();
    }
}
