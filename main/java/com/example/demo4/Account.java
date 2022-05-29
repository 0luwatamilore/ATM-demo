package com.example.demo4;

// Account.java
// Represents a bank account

public class Account {

    // represents a user's account number
     private Long accountNumber;

    // represents an account's username
    private String accountName;

    // represents the account's PIN for withdrawal and authentication
    private Long pinNumber;

    // represents the account's available balance
    private Long availableBalance;


    // Account constructors
    public Account(){
        // represents an empty constructor
    }
    // end of empty constructor


    // Account constructor initializes attributes
    public Account(Long accountNumber, String accountName, Long pinNumber, Long availableBalance) {
        // Account accountNumber == Constructor accountNumber
        this.accountNumber = accountNumber;
        // Account accountName == Constructor accountName
        this.accountName = accountName;
        // Account pinNumber == Constructor pinNumber
        this.pinNumber = pinNumber;
        // Account availableBalance == Constructor availableBalance
        this.availableBalance = availableBalance;
    }
    // end of non-empty constructor


    // returns a String of attributes
    public String toString(){
        return accountNumber + ", " + accountName +", " + pinNumber + ", " + availableBalance;
    }
    // end of toString Operator


    // returns account number
    public Long getAccountNumber() {
        return accountNumber;
    }
    // end getAccountNumber


    // assigns an account number
    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
    //end setAccountNumber


    // returns the account name
    public String getAccountName() {
        return accountName;
    }
    // end getAccountName


    // sets an account name
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    // end setAccountName


    // returns PIN
    public Long getPinNumber() {
        return pinNumber;
    }
    // end getPinNumber


    // sets the user's PIN
    public void setPinNumber(Long pinNumber) {
        this.pinNumber = pinNumber;
    }
    // end setPinNumber


    // returns available balance
    public Long getAvailableBalance() {
        return availableBalance;
    }
    // end getAvailableBalance


    // sets a user's available Balance
    public void setAvailableBalance(Long availableBalance) {
        this.availableBalance = availableBalance;
    }
    // end setAvailableBalance


    // credits an amount to the account
    public void credit(Long amount){
        availableBalance += amount;
    }
    // end credit


    // debit an account a certain amount
    public void debit(Long amount){
        availableBalance -= amount;
    }
    // end debit
}
// end class Account
