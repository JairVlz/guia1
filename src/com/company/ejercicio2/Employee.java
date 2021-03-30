//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company.ejercicio2;

public class Employee {
    private int dni;
    private String name;
    private String lastName;
    private double salary;

    public Employee() {
    }

    public Employee(int dni, String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = (double)salary;
        this.dni = dni;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalaryAnnual() {
        return this.salary * 12.0D;
    }

    public void aummentSalary(double percentage) {
        this.salary += this.salary * (percentage / 100.0D);
    }

    public void showEmployee(Employee subject) {
        System.out.println("Employee:\nName:" + subject.name + "\nlastName:" + subject.lastName + "\nDNI:" + subject.dni + "\nSalary:" + subject.salary);
    }
}
