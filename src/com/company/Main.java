package com.company;

public class Main {

    public static void main(String[] args) {
        Patron grandMoney = new Patron(new BankAccount(500), 50);

        grandMoney.deposit(50);
        System.out.println(grandMoney.currentBalance());

	// write your code here
    }
}
