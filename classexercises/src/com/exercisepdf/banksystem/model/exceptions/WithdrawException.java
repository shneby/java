package com.exercisepdf.banksystem.model.exceptions;

public class WithdrawException extends Exception {
    private Integer clientId;
    private Float currentBalance;
    private Float withdrawAmount;

    public WithdrawException(String message, Integer clientId, Float currentBalance, Float withdrawAmount) {
        super(message);
        this.clientId = clientId;
        this.currentBalance = currentBalance;
        this.withdrawAmount = withdrawAmount;
    }

    public int getClientId() {
        return clientId;
    }

    public float getCurrentBalance() {
        return currentBalance;
    }

    public float getWithdrawAmount() {
        return withdrawAmount;
    }
}
