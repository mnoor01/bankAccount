package com.company;

public class BankAccount {
private int balance;

public BankAccount(int balance) {
this.balance= balance;
}
public void deposit(int pocket) {
    this.balance += pocket;

}
public void withdrawal(int pocket) {
    this.balance-= pocket;
}
public int getBalance() {
    return balance;

}
}
