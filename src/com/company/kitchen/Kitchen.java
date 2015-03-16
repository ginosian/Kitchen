package com.company.kitchen;

import java.util.ArrayList;

/**
 * Created by Marta on 3/9/2015.
 */
public class Kitchen {
    // region Instance Fields
    private ArrayList <Ingridient> ingridients;
    private ArrayList <Reciepts> recieptses;
    private ArrayList<Reciepts> dishesList;
    // endregion

    // Constructors
    public Kitchen() {
        ingridients = new ArrayList<Ingridient>();
        recieptses = new ArrayList<Reciepts>();
        dishesList = new ArrayList<Reciepts>();
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

    public void printIngridentsInfo (){
        for (int i = 0; i < ingridients.size(); i++){
            System.out.print(i + 1 + ". ");
           ingridients.get(i).printInfo();
            System.out.println();
        }
    }
    public void printReceptesInfo (){
        for (int i = 0; i < recieptses.size(); i++){
            System.out.print(i + 1 + " ");
            recieptses.get(i).printInfo();
            System.out.println();
        }
    }

    public void printReceptDescription(Reciepts reciepts){
        int sum = 0;
        for ( int i = 0; i < reciepts.getReciept().size(); i++) {
            System.out.println("Ingridient name " + reciepts.getReciept().get(i).getName() + "\t" + "ingridient quantity " +
                    reciepts.getReciept().get(i).getQuantity() + "\t" + "ingridient total cost "
                    + reciepts.getReciept().get(i).getUnitPrice() * reciepts.getReciept().get(i).getQuantity());
            sum += reciepts.getReciept().get(i).getUnitPrice() * reciepts.getReciept().get(i).getQuantity();
        }
        System.out.println("_____________________________________________________");
        System.out.println("Overall cost is " + sum + " drams.");
    }
    public boolean cookADish(Reciepts reciepts){
        if (reciepts != null){
            for (int i = 0; i < reciepts.getReciept().size(); i++){
                for (int j = 0; j < ingridients.size(); j++){
                    if (reciepts.getReciept().get(i).getName().equals(ingridients.get(j).getName())){
                       if(ingridients.get(j).getQuantity()-reciepts.getReciept().get(i).getQuantity() > 0 ){
                          ingridients.get(j).setQuantity(ingridients.get(j).getQuantity()-reciepts.getReciept().get(i).getQuantity());
                       }
                    }
                }
            }
            dishesList.add(reciepts);
            return true;
        }
        return false;
    }

    public void printDishesList (){
        for (int i = 0; i < dishesList.size(); i++){
            System.out.println(dishesList.get(i).getName());
        }
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

    public ArrayList<Reciepts> getDishesList() {
        return dishesList;
    }

    public void setDishesList(ArrayList<Reciepts> dishesList) {
        this.dishesList = dishesList;
    }

    // endregion
}
