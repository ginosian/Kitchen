package com.company.kitchen;

import java.util.ArrayList;

/**
 * Created by Marta on 3/8/2015.
 */
public class Reciepts {
    // region Instance Fields
    private ArrayList <Ingridient> reciept;
    private String name;
    // endregion

    // region Constructors
    public Reciepts(String name) {
        this.name = name;
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
        System.out.println(name);
        for(int i = 0; i < reciept.size(); i++){
            System.out.println(reciept.get(i).getName());
        }
    }

    // region Setters and Getters

    public ArrayList<Ingridient> getReciept() {
        return reciept;
    }

    public void setReciept(ArrayList<Ingridient> reciept) {
        this.reciept = reciept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // endregion
}
