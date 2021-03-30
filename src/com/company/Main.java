//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import com.company.ejercicio2.Employee;
import com.company.ejercicio3.itemSale;
import com.company.ejercicio4.BankAccount;
import com.company.ejercicio5.Time;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public Main() {
    }

    public static void main(String[] args) {
        double percentage = 0.0D;
        double balanceToAdd1 = 0.0D;
        double balanceToRetired = 0.0D;
        double result = 0.0D;
        double result2 = 0.0D;
        double annualSalary2 = 0.0D;
        double annualSalary3 = 0.0D;
        System.out.println("ingrese hora:");
        int hour = scanner.nextInt();
        System.out.println("ingrese los minutos:");
        int min = scanner.nextInt();
        System.out.println("ingrese los seg:");
        int seg = scanner.nextInt();
        Time tiempo = new Time(hour, min, seg);
        tiempo.aumenttSeg(tiempo);
        tiempo.showTime(tiempo);
        tiempo.decreaseSeg(tiempo);
        tiempo.showTime(tiempo);
        BankAccount account1 = new BankAccount(1, 15000.0D, "Franco", "Zanna");
        itemSale item1 = new itemSale("gran mouse", 1, 10, 5440, 1);
        Employee subject = new Employee(23456345, "Carlos", "Gutiérrez", 25000);
        Employee subject2 = new Employee(34234123, "Ana", "Sánchez", 27500);
        subject.showEmployee(subject);
        subject2.showEmployee(subject2);
        annualSalary2 = subject.calculateSalaryAnnual();
        annualSalary3 = subject2.calculateSalaryAnnual();
        System.out.println("This is the annual salary:" + annualSalary2);
        System.out.println("This is the annual salary:" + annualSalary3);
        System.out.println("¿Cuanto Porcentaje desea aumentar?\n");
        percentage = scanner.nextDouble();
        subject.aummentSalary(percentage);
        subject.showEmployee(subject);
        int totalPrice = item1.totalPriceProducct(item1);
        item1.setTotalPrice(totalPrice);
        item1.showItem(item1);
        System.out.println("¿Cuanto dinero desea agregar?\n");
        balanceToAdd1 = scanner.nextDouble();
        result = account1.addBalance(balanceToAdd1);
        account1.setBalance(result);
        System.out.println("¿Cuanto dinero desea retirar?\n");
        balanceToRetired = scanner.nextDouble();
        result2 = account1.moneyTheft(balanceToRetired);
        account1.setBalance(result2);
        System.out.println("¿Cuanto dinero desea retirar?\n");
        balanceToRetired = scanner.nextDouble();
        result2 = account1.moneyTheft(balanceToRetired);
        account1.setBalance(result2);
        account1.showAccount(account1);
    }

    static {
        scanner = new Scanner(System.in);
    }
}
