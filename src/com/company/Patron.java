package com.company;

public class Patron {
    private String name;
    private  BankAccount bankAccount;
    private int pocket;


    public Patron(BankAccount bankAccount, int pocket) {
       this.bankAccount= bankAccount ;
        this.pocket= pocket;
    }
    public void deposit(int amount) {
        pocket= pocket - amount ;
        bankAccount.deposit(amount);



    }
    public void Withdrawal(int amount) {
        bankAccount.withdrawal(amount);
        pocket= pocket + amount;

    }

    public int currentBalance() {
        return bankAccount.getBalance();


    }

}
