package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.List;

public class Banking {
   
    private List<Accounts> accts;
    private String accountType;

    public Banking(List<Accounts> accts) {
        this.accts = new ArrayList<>();
    }

    public void showAccountDetails() {  
        System.out.println("Name of Account holder: " + name);  
        System.out.println("Account Number.: " + accno);  
        System.out.println("Account type: " + accountType);  
        System.out.println("Balance: " + balance);  
    }  
/**
     * The Bank class represents a bank that can create and manage accounts.
     * It provides methods to open new accounts, close existing accounts,check if an account exists,
     * search for account,verifies an account details, update an account,
     * and perform various other banking operations.
     */

     private List<Accounts> acctObj;
     private long acctNumber;
 
     public Banking(long acctNumber) {
         this.acctObj = new ArrayList<>();
         this.acctNumber = acctNumber;
     }
 
     public List<Accounts> getAcctObj() {
         return this.acctObj;
     }
 
     public void addNewAccount(Accounts acctNum){  //adds created account generated if none exists
         if(findAccount(acctNum)){
             System.out.println("Account is Already on list");
         }else {
             this.acctObj.add(acctNum);
         }
 
     }
 
     private boolean findAccount(Accounts acctNum) {    //finds account with complete details
        boolean flag = true;
         for(Accounts s : this.acctObj) {
             if (s == acctNum) {
                 System.out.println("Account Already Exists");
                 System.out.println(acctNum.getAccountType() + " " + acctNum.getFullName()
                         + " " + acctNum.getAccountNumber());
                 return flag;
             } else {
                 System.out.println("Account does not exist. Please generate an Account number to open an account");
                 flag = false;
                 return flag;
 
             }
         }
         return flag;
 
     }
     public void InstructionList(){
         System.out.println("""
                 Please supply your full name and the type of account you will like to open here at PrivateBank when prompted to. We have three types of account\s
                  1. Basic \s
                  2. Savings \s
                  3. Current\s
                  Thank you""");
     }
     public Accounts openAccount(String fullName,String acctType,long deposit){  // opening of an account
         long acctNum = generateNewAccountNumber();
         Accounts acct = null;
         switch (acctType.trim().toLowerCase()) {
             case "savings" -> {
                 acct = new SavingsAccount(fullName, acctNum);
                 acct.deposit(deposit);
                 System.out.println("Your Savings Account have been opened");
                 this.acctObj.add(acct);
             }
             case "basic" -> {
                 acct = new Accounts(fullName, acctNum);
                 acct.deposit(deposit);
                 System.out.println("Your Basic Account have been opened");
                 this.acctObj.add(acct);
             }
             case "current" -> {
                 acct = new CurrentAccount(fullName, acctNum);
                 acct.deposit(deposit);
                 System.out.println("Your Current Account have been opened");
                 this.acctObj.add(acct);
             }
             default -> System.out.println("Invalid Account Type entry Please try Again");
         }
 
         return acct;
     }
     private int findAccount(long acctNum) { //used to update the selected account by getting the index position on the list
         // overloaded findAccount finds account with only account number and returns the bearer of the account
         for(int i = 0; i < this.acctObj.size(); i++) {
             Accounts acct = this.acctObj.get(i);
             System.out.println(acct.getFullName() + acct.getAccountNumber());
             if (acct.getAccountNumber() == acctNum) {
                 return i;
             }
         }
         System.out.println("Contact not on list");
         return -1;
 
     }
 
     private String VerifyAccountName(long acctNum) {    // verifies an account holder details using account number
         return null;
     }
 
     public void transaction(long acctnum, String transac){
         // performs transactions of paying bills and transfer of funds for account holders
         switch (transac.trim().toLowerCase()) {

             case "pay bills" : payBills(acctnum);
                                break;
             case "transfer funds" : transfer(acctnum);
                                     break;
             default : 
             System.out.println("You can only pay bills and transfer funds");
             break;
         }
     }
 
     private void transfer(long acctnum) {
     }
 
     public void payBills(long acctnum) {
     }
 
     public void update(Accounts oldInfo, Accounts newInfo){

     }
 
     private long generateNewAccountNumber() {
         // Finding the maximum accountNumber using a loop
         long maxAccountNumber = 10000000L;
 
         for (Accounts account : this.acctObj) {
             long currentAccountNumber = account.getAccountNumber();
             if (currentAccountNumber > maxAccountNumber) {
                 maxAccountNumber = currentAccountNumber;
             }
         }
 
         return maxAccountNumber + 1;
     }
     public long getAcctNumber(){
         return this.acctNumber;
     }
 
 }
    
}
