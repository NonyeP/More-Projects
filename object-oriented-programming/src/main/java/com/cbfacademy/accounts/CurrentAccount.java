package com.cbfacademy.accounts;

import java.math.BigDecimal;
import java.util.Date;

public class CurrentAccount extends Accounts{
    private double overdraftLimit;
    private double overDraftAmount1;

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        CurrentAccount acw = new CurrentAccount(12345678,2500);
        Accounts cr = new CurrentAccount(12345678, -10 ,10);
        CurrentAccount ccd = new CurrentAccount("Juliet Phelan", 12345678);
        
        //System.out.println(ccd.getOverDraftAmount1());
        //System.out.println(ac.overDraft());
        System.out.println(cr.overDraft());
        //System.out.println(cr.withdraw(10));
    }

    public CurrentAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
        this.overdraftLimit = -1000;
    
    
    }
    

    public CurrentAccount(String fullName, long accountNumber) {
        super(fullName, accountNumber);
        System.out.println(fullName + " " + accountNumber);
    
    }


    public CurrentAccount(long accountNumber, double balance, double overDraftAmount1) {
        super(accountNumber, balance);
        getBalance();
        if(balance > 0) {
            this.overDraftAmount1 = 0;
        }else{
            if(overDraftAmount1 > 0){
                System.out.println("overdraft exceeded. please input values between -1 and -1000");
            overDraftAmount1 = 0;
        
              }else if(overDraftAmount1==0){
                System.out.println("No overdraft set");
                overDraftAmount1 = 0;
            }else{
            this.overDraftAmount1 = overDraftAmount1;
            System.out.println("Your overdraft is ready: £ " + this.overDraftAmount1);
            }
        
            
        }
        
    }


    @Override
    public double getBalance() {
        if(super.getBalance() > 0){ 
            System.out.println("Your Account Balance = £" + super.getBalance());
            return super.getBalance();
        }else if(super.getBalance() < 0){
            System.out.println("Invalid input: Please input positive integers.");
            return 0;
        }else{
            System.out.println("Request for OverDraft");
            return 0;
        }
    }
       
    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }
    
     public double getOverDraftAmount1() {
        return this.overDraftAmount1;
    }



   
    // @Override
    // public BigDecimal withdraw(double moneyOut) {
    //     checkForOverDraft();
    //     if(moneyOut < 0 ){
    //         System.out.println("Invalid Input: Please input positive integers.");
    //         return null;
    //     }else if((moneyOut >= 0)&&(moneyOut <= this.balance)){
    //         this.balance -= moneyOut;
    //         System.out.println("Your Account Balance = £" + this.balance);
    //         BigDecimal convertTo = BigDecimal.valueOf(this.balance);
    //         return convertTo;
    //     }else{
    //         System.out.println("Invalid input: You need an overdraft");
    //         overDraft();
    //         return null;
    //     }
    //     return super.withdraw(moneyOut);

    // }
  
    
    // public boolean checkForOverDraft() {
    //     double odraft = 

    // }


    

    @Override
    public double overDraft() {
        double bal = super.getBalance(); 
        double drf = getOverDraftAmount1();
        double newBalance = 0;
        if((bal == 0) && (drf > 0)) {
        newBalance = bal + drf;
        System.out.println("Current Account Balance is: £ " + newBalance);//(super.getBalance() + getOverDraftAmount1()));
        return newBalance;
        }else{
        return newBalance;
        }
        // double bal = super.getBalance(); 
        // double drf = getOverDraftAmount1();
        // double newBalance = bal+drf;
        // System.out.println("Current Account Balance is: £ " + newBalance);//(super.getBalance() + getOverDraftAmount1()));
        
        // return newBalance;
    
    }

    
   

    

    

    
    
}
