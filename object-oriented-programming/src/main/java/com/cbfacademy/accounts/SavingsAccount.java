package com.cbfacademy.accounts;

import java.math.BigDecimal;


public class SavingsAccount extends Accounts {
    private double interest;


    public static void main(String[] args) {
        //Accounts acct1 = new SavingsAccount("9876543", 3000);
        //SavingsAccount acct = new SavingsAccount("123456", 500);
        //System.out.println(acct.addInterest());
        //System.out.println(acct.addInterest());
        //System.out.println(acct.deposit(500));
        //System.out.println(acct.deposit(3000));
    }
    
    

    public SavingsAccount(String fullName, long accountNumber) {
        super(fullName, accountNumber);
        
    }

    public double getInterest() {
        return this.interest;
    }
    
    public BigDecimal addInterest(){
        System.out.println("Previous Balance = £" + super.getBalance());
        double amount = super.getBalance() * interest/100;
        System.out.println("Interest on £" + super.getBalance() + " is: £" + amount);
        double newBalance = amount + super.getBalance();
        System.out.println("New Balance = £" +  newBalance);
        return super.deposit(amount);
       
    }
    
    
}
