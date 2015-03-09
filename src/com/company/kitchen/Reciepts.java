package com.company.kitchen;

import java.util.ArrayList;

/**
 * Created by Marta on 3/8/2015.
 */
public class Reciepts {
    // region Instance Fields
    private ArrayList <Ingridient> reciept;
    // endregion

    // region Constructors
    public Reciepts() {
        reciept = new ArrayList <Ingridient>();
    }
    // endregion

    // region Member Methods
    public boolean addIngridientInReciept(Ingridient ingridient, double recieptQuantity){
        if (ingridient != null){
            ingridient.setRecieptQuantity(recieptQuantity);
            reciept.add(ingridient);
            return true;
        }
        return false;
    }

    public boolean removeIngridientFromReciept(Ingridient ingridient){
        if(ingridient != null){
            if(reciept.remove(ingridient)){
                return true;
            }
        }
        return false;
    }

    public void printInfo(){
        if (reciept.size() == 0){
            return;
        }
        int overallCost = 0;
        for(int i = 0; i < reciept.size(); i++){
            System.out.print(reciept.get(i).getName());
            System.out.print("\t");
            System.out.print("quantity - " + reciept.get(i).getRecieptQuantity());
            System.out.print("\t");
            System.out.print("Total cost of ingredient is " + reciept.get(i).getRecieptQuantity() * reciept.get(i).getUnitPrice());
            overallCost += reciept.get(i).getRecieptQuantity() * reciept.get(i).getUnitPrice();
        }
        System.out.println("________________________________________________________________________________");
        System.out.println("Overall cost of food is " + overallCost);
    }

    // region Setters and Getters

    public ArrayList<Ingridient> getReciept() {
        return reciept;
    }

    public void setReciept(ArrayList<Ingridient> reciept) {
        this.reciept = reciept;
    }
    // endregion
}
