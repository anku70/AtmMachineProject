package com.coder;

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    // Default constructor

    public ATM(){

    }

    // Getter And Setter

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositeAmount) {
        this.depositAmount = depositeAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
