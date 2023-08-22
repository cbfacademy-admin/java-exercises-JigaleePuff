package com.cbfacademy.accounts;

public class SavingsAccount {
    private int accountNumber;
    private double balance;
}

public class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
        this.interest = 0.25;
        this.balance = balance + interest;
    }
  @Override
    public string getSavingsAccount() {
        return "SavingsAccount" + super.getDetails();
 }


} 