package ru.job4j.encapsulation;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account();
        account.addMoney(100);
        account.line();
        account.addMoney(50);
        account.line();

    }
}
