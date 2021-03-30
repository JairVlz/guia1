
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company.ejercicio3;

public class itemSale {
    private String description;
    private int id;
    private int amount;
    private int unitPrice;
    private int totalPrice;

    public itemSale() {
    }

    public itemSale(String description, int id, int amount, int unitPrice, int totalPrice) {
        this.description = description;
        this.id = id;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int totalPriceProducct(itemSale producct) {
        return producct.amount * producct.unitPrice;
    }

    public void showItem(itemSale producct) {
        System.out.println("Item:\nID:" + producct.id + "\nAmount:" + producct.amount + "\nDescription:" + producct.description + "\nUnit Price:" + producct.unitPrice + "\nTotal Price:" + producct.totalPrice);
    }
}
