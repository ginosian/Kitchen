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
            Ingridient recieptIngridient = new Ingridient(ingridient.getName(), recieptQuantity, ingridient.getUnitPrice() * recieptQuantity);
            reciept.add(recieptIngridient);
            return true;
        }
        return false;
    }

    public boolean removeIngridientFromReciept(Ingridient ingridient){
        if(ingridient != null && reciept != null){
            for (int i = 0; i < reciept.size(); i++){
                if (reciept.get(i).getName() == ingridient.getName()){
                    reciept.remove(i);
                    return true;
                }
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
            System.out.print("quantity - " + reciept.get(i).getQuantity());
            System.out.print("\t");
            System.out.print("Total cost of ingredient is " + reciept.get(i).getQuantity() * reciept.get(i).getUnitPrice());
            overallCost += reciept.get(i).getQuantity() * reciept.get(i).getUnitPrice();
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
