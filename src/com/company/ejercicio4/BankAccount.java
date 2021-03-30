//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company.ejercicio4;

public class BankAccount {
    private int id;
    private double balance;
    private String name;
    private String lastName;

    public BankAccount() {
    }

    public BankAccount(int id, double balance, String name, String lastName) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double addBalance(double balanceToAdd) {
        return balanceToAdd + this.balance;
    }

    public void showAccount(BankAccount account) {
        System.out.println("account:\nID:" + account.id + "\nBalance:" + account.balance + "\nName:" + account.name + "\nLastName:" + account.lastName);
    }

    public double moneyTheft(double moneyToWithdraw) {
        if (this.balance - moneyToWithdraw < 0.0D) {
            System.out.println("The amount entered is invalid ");
            return this.balance;
        } else {
            return this.balance - moneyToWithdraw;
        }
    }
}
