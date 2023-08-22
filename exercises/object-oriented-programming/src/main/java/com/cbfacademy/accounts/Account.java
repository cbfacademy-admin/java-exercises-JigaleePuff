package com.cbfacademy.accounts;


public class Account {
    private int accountNumber;
    private double balance;
 


 public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    
 }

 public double withdraw (double amount ) {
    double withdrawal = Math.abs(amount);
    if (this.balance >= withdrawal ){
        System.out.println ("Withdrawn;");
        this.balance -= withdrawal;
        return withdrawal;
    }
    else {
        System.out.println ("Go make more money!");
        return 0;
    }
    
 } public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
    } else {
        System.out.println("Cannot deposit a negative amount.");
    }
}

public double getBalance() {
return balance;
}

public int getAccountNumber() {
return accountNumber;
}

/**
 * 
 */
public void print() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Balance: " + balance);

}
 

