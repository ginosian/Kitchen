package com.company.kitchen;

/**
 * Created by Marta on 3/8/2015.
 */
public class Ingridient {
     // region Instance Fields
    private String name;
    private double quantity;
    private double unitPrice;
    // endregion

    // region Constructors

    public Ingridient(String name, double quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

// endregion

    // region Member Methods
    public void printInfo(){
        System.out.println(name + "\t" + "quantity - " + quantity + ", unit price - " + unitPrice);
    }
    // endregion

    // region Setters and Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // endregion

}
