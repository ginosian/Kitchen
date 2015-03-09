package com.company.kitchen;

/**
 * Created by Marta on 3/8/2015.
 */
public class Ingridient {
     // region Instance Fields
    private String name;
    private double overallQuantity;
    private double recieptQuantity;
    private double unitPrice;
    // endregion

    // region Constructors
    public Ingridient(String name, double overallQuantity, double unitPrice) {
        this.name = name;
        this.overallQuantity = overallQuantity;
        this.unitPrice = unitPrice;
    }
// endregion

    // region Member Methods
    public void printInfo(){
        System.out.println(name + "\t" + "quantity - " + overallQuantity + ", unit price - " + unitPrice);
    }
    // endregion

    // region Setters and Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOverallQuantity() {
        return overallQuantity;
    }

    public void setOverallQuantity(double overallQuantity) {
        this.overallQuantity = overallQuantity;
    }

    public double getRecieptQuantity() {
        return recieptQuantity;
    }

    public void setRecieptQuantity(double recieptQuantity) {
        this.recieptQuantity = recieptQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // endregion

}
