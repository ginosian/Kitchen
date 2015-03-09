package com.company.kitchen;

import java.util.ArrayList;

/**
 * Created by Marta on 3/9/2015.
 */
public class Kitchen {
    // region Instance Fields
    private ArrayList <Ingridient> ingridients;
    private ArrayList <Reciepts> recieptses;
    // endregion

    // Constructors
    public Kitchen() {
        ingridients = new ArrayList<Ingridient>();
        recieptses = new ArrayList<Reciepts>();
    }
    // endregion

    // region Member Methods
    public boolean addReciept(Reciepts reciepts){
        if(reciepts != null ){
            recieptses.add(reciepts);
            return true;
        }
        return false;
    }
    public boolean removeReciept(Reciepts reciepts){
        if(reciepts != null){
            if (recieptses.remove(reciepts)){
                return true;
            }
        }
        return false;
    }
    public boolean addIngridentInKitchen(Ingridient ingridient){
        if (ingridient != null){
            ingridients.add(ingridient);
            return true;
        }
        return false;
    }
    public boolean removeIngridientInKitchen(Ingridient ingridient){
        if (ingridient != null){
            if (ingridients.remove(ingridient)){
                return true;
            }
        }
        return false;
    }
    public boolean cookADish(Reciepts reciepts){
        if (reciepts != null){
            for (int i = 0; i < reciepts.getReciept().size(); i++){
                for ( int j = 0; j < ingridients.size(); j++){
                    if (reciepts.getReciept().get(i).getName() == ingridients.get(j).getName()){
                       if(ingridients.get(j).getQuantity()-reciepts.getReciept().get(i).getQuantity() > 0 ){
                           return true;
                       }
                    }
                }
            }
        }
        return false;
    }


    // Setters and Getters
    public ArrayList<Ingridient> getIngridients() {
        return ingridients;
    }

    public void setIngridients(ArrayList<Ingridient> ingridients) {
        this.ingridients = ingridients;
    }

    public ArrayList<Reciepts> getRecieptses() {
        return recieptses;
    }

    public void setRecieptses(ArrayList<Reciepts> recieptses) {
        this.recieptses = recieptses;
    }
    // endregion
}
