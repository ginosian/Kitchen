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
    cucadrel patrasti ureliqnery
    ingirdientneri mej cucadrel miavori arjeqy
    receptneri mej cucadrel juraqanchur ingridienti yndhanur arjeqy ev uteliqi inqnarjeqy */



    public static void main(String[] args) {
	    Kitchen kitchen = new Kitchen();
        do {
            if (menu(kitchen)){
                return;
            }
        }   while (true);


    }

    public static boolean menu(Kitchen kitchen){
        System.out.println("1. Add ingridient");
        System.out.println("2. Remove ingridient");
        System.out.println("3. Add recept");
        System.out.println("4. Remove recept");
        System.out.println("5. Show ingridients list");
        System.out.println("6. Show recepts list");
        System.out.println("7. Show recept description");
        System.out.println("8. Cook a dish");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput){
            case 1:
                System.out.println("Enter name, quantity and unit price");
                Ingridient ingrident = new Ingridient(scanner.next(), scanner.nextDouble(), scanner.nextDouble());
                kitchen.addIngridentInKitchen(ingrident);
                break;
            case 2:
                if (kitchen.getIngridients().size() == 0){
                    System.out.println("Enter ingredients first");
                    break;
                }
                System.out.println("Choose which ingredient you want to remove");
                kitchen.printIngridentsInfo();
                int removeIngridientIndex = scanner.nextInt();
                for (int i = 0; i < kitchen.getIngridients().size(); i++){
                    if (i == removeIngridientIndex-1){
                        kitchen.removeIngridientInKitchen(kitchen.getIngridients().get(i));
                    }
                }
                break;
            case 3:
                boolean check = true;
                System.out.println("Enter your recept name");
                Reciepts recept = new Reciepts(scanner.next());
                System.out.println("Choose which ingredient you want to add to your reciept from a list");
                kitchen.printIngridentsInfo();
                int userIndex = scanner.nextInt();
                do {
                double quantity;
                for (int i = 0; i < kitchen.getIngridients().size(); i++){
                    if (userIndex-1 == i){
                        System.out.println("Please enter quantity");
                        quantity = scanner.nextDouble();
                        recept.addIngridientInReciept(kitchen.getIngridients().get(i), quantity);
                        kitchen.printIngridentsInfo();
                    }
                }
                    System.out.println("Choose  next which ingredient you want to add to your reciept from a list or press 0 to exit");
                    kitchen.printIngridentsInfo();
                    userIndex = scanner.nextInt();
                    if (userIndex == 0){
                        check = false;
                    }  else {
                        if (userIndex < 0 && userIndex > kitchen.getIngridients().size() ){
                            check = false;
                        }
                    }

                } while (check == true);



                break;
        }
        return false;
    }
}





