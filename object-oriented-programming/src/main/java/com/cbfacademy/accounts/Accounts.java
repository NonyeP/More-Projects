package com.cbfacademy.accounts;

import java.math.BigDecimal;

public class Accounts {

    private String fullName;
    private long accountNumber;
    private double balance;
    private double overDraftAmount;
    private String accountType;

    public static void main(String[] args) {
       //Accounts acct = new Accounts("12345678", 0);
       // System.out.println(acct.withdraw(10));
    }
    public Accounts(String fullName, long accountNumber, String accountType) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.overDraftAmount = 0;
        this.accountType = accountType;
    }


    
    public Accounts(String fullName, long accountNumber) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
    }



    public Accounts(long accountNumber, double balance) {// for current Account only
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overDraftAmount = 500;
    }

    
    public Accounts(long accountNumber, double balance, double overDraftAmount){

    }
    
    
    
    public Accounts(String fullName, double balance) {
        this.fullName = fullName;
        this.balance = balance;
    }
    

    public BigDecimal deposit(double moneyIn){
        System.out.println("*****Deposit Statement Begins***** ");
        if(moneyIn >= 0){
            this.balance += moneyIn;
            System.out.println("Your Account Balance = £" + this.balance);
            BigDecimal convertTo = BigDecimal.valueOf(this.balance);
            System.out.println("*****Deposit Statement Ends***** ");
            return convertTo;
        }else{
            System.out.println("Invalid input: Please input positive integers.");
            overDraft();
            System.out.println("****Deposit Statement Ends***** ");
            return null;
        }

    }



     public double overDraft() {
        this.balance += overDraftAmount;
        this.balance = -this.balance;
        System.out.println("You now have an overDraft amount of £" + this.balance );
        return this.balance;
        

    }



    public BigDecimal withdraw(double moneyOut){
        System.out.println("*****Withdrawal Statement Begins***** ");
        if(moneyOut < 0 ){
            System.out.println("Invalid Input: Please input positive integers.");
            return null;
        }else if((moneyOut >= 0)&&(moneyOut <= this.balance)){
            this.balance -= moneyOut;
            System.out.println("Your Account Balance = £" + this.balance);
            BigDecimal convertTo = BigDecimal.valueOf(this.balance);
            System.out.println("*****Withdrawal Statement Ends***** ");
            return convertTo;
        }else{
            System.out.println("Invalid input: You need an overdraft");
            overDraft();
            System.out.println("*****Withdrawal Statement Ends***** ");
            return null;
        }

    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }


    public String getFullName() {
        return fullName;
    }



    @Override
    public String toString() {
        System.out.println("Welcome to Private Bank");
        return "[Accounts name = " + fullName + ", accountNumber = " + accountNumber + "]";
    }

    
}
