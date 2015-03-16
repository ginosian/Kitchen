package com.company.kitchen;

import java.util.Scanner;

public class Main {

    /* AVELACNEL INGRIDIENt
    avelacnel recept
    jnjel ingridient
    jnjel recept
    patrastel uteliq
    cucadrel ingridientner@
    cucadrel receptnery
    cucadrel patrasti e
    ingirdientneri mej cucadrel miavori arjeqy
    receptneri mej cucadrel juraqanchur ingridienti yndhanur arjeqy ev uteliqi inqnarjeqy */


    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        do {
            if (menu(kitchen)) {
                return;
            }
        } while (true);


    }

    public static boolean menu(Kitchen kitchen) {
        System.out.println("1. Add ingridient");
        System.out.println("2. Remove ingridient");
        System.out.println("3. Add recept");
        System.out.println("4. Remove recept");
        System.out.println("5. Show ingridients list");
        System.out.println("6. Show recepts list");
        System.out.println("7. Show recept description");
        System.out.println("8. Cook a dish");
        System.out.println("9. Show ready dishes list");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Enter name, quantity and unit price");
                Ingridient ingrident = new Ingridient(scanner.next(), scanner.nextDouble(), scanner.nextDouble());
                kitchen.addIngridentInKitchen(ingrident);
                break;
            case 2:
                if (kitchen.getIngridients().size() == 0) {
                    System.out.println("Enter ingredients first");
                    break;
                }
                System.out.println("Choose which ingredient you want to remove");
                kitchen.printIngridentsInfo();
                int userInputForCase2 = scanner.nextInt();
                for (int i = 0; i < kitchen.getIngridients().size(); i++) {
                    if (i == userInputForCase2 - 1) {
                        kitchen.removeIngridientInKitchen(kitchen.getIngridients().get(i));
                    }
                }
                break;
            case 3:
                if (kitchen.getIngridients().size() != 0) {
                    boolean check = true;
                    System.out.println("Enter your recept name");
                    Reciepts recept = new Reciepts(scanner.next());
                    int userInputForCase3 = 0;
                    double userInputForQuantity = 0;
                    do {
                        System.out.println("Choose ingredient you want to add or press 0 to exit");
                        kitchen.printIngridentsInfo();
                        userInputForCase3 = scanner.nextInt();
                        if (userInputForCase3 == 0){
                            check = false;
                        }
                        else if (userInputForCase3 > 0 && userInputForCase3 <= kitchen.getIngridients().size()){
                            for (int i = 0; i < kitchen.getIngridients().size(); i++){
                                if (userInputForCase3-1 == i){
                                    System.out.println("Enter quantity of ingridient in recept");
                                    userInputForQuantity = scanner.nextDouble();
                                        recept.addIngridientInReciept(kitchen.getIngridients().get(i), userInputForQuantity);
                                        check = true;
                                }
                            }
                        }

                        else {  System.out.println("Add a valid input"); check = true; }
                    } while (check == true);
                    kitchen.addReciept(recept);
                }
                else {
                    System.out.println("You dont have ingridients in your kithen");}
                break;


            case 4:
                if (kitchen.getRecieptses().size() != 0) {
                    kitchen.printReceptesInfo();
                    System.out.println("Choose which recept you want to remove");
                    int userInputForCase4 = scanner.nextInt();
                    for (int i = 0; i < kitchen.getRecieptses().size(); i++) {
                        if (userInputForCase4 == i + 1) {
                            kitchen.removeReciept(kitchen.getRecieptses().get(i));
                        }
                    }
                } else {
                    System.out.println("Add receptes first");
                }
                break;
            case 5:
                if (kitchen.getIngridients().size() != 0) {
                    kitchen.printIngridentsInfo();
                } else {
                    System.out.println("you dont have any ingridients in your kkitchen");
                }
                break;
            case 6:
                if (kitchen.getRecieptses().size() != 0) {
                    kitchen.printReceptesInfo();
                } else {
                    System.out.println("You dont have any receptes in your kitchen");
                }
                break;
            case 7:
                if (kitchen.getRecieptses().size() != 0) {
                    kitchen.printReceptesInfo();
                    System.out.println("Choose which recept you want to see");
                    int userInputForCase7 = scanner.nextInt();
                    for (int i = 0; i < kitchen.getRecieptses().size(); i++) {
                        if (userInputForCase7 - 1 == i) {
                            kitchen.printReceptDescription(kitchen.getRecieptses().get(i));
                        }
                    }
                } else {
                    System.out.println("You dont have any receptes in your kitchen");
                }
                break;
            case 8:
                if (kitchen.getRecieptses().size() != 0) {
                    kitchen.printReceptesInfo();
                    System.out.println("Choose which recept you want to use to cook a dish");
                    int userInputForCase8 = scanner.nextInt();
                    for (int i = 0; i < kitchen.getRecieptses().size(); i++)
                        if (userInputForCase8 - 1 == i) {
                            if (kitchen.cookADish(kitchen.getRecieptses().get(i))) {
                                System.out.println("Your dish is cooked");
                            }
                        }
                } else {
                    System.out.println("Add receptes first");}
                break;
            case 9:
                if(kitchen.getDishesList().size() != 0){
                    kitchen.printDishesList();
                } else {
                    System.out.println("You dont have any ready dishes, cook one first");}

        }
        return false;
    }
}







