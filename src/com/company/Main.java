package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    static ShoppingList shoppingList = new ShoppingList();

    public static void main(String[] args) {
//we are performing methods based on what the user types in.
        boolean quit = false;
        int answer;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice");
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    shoppingList.printShoppingList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
//We can only use arraylist methods in main when we have initialized our arraylist in main!
//        ArrayList<String> hello = new ArrayList<String>();
//        hello.add("banana");
//        hello.add("cherries");
//        hello.add("glouten");
//        System.out.println(hello.get(1));
//        System.out.println(hello.indexOf("glouten"));
//
//        ShoppingList shop = new ShoppingList();
//
//        shop.addShoppingItem("Frank");
//        shop.addShoppingItem("Bea");
//        shop.addShoppingItem("Elo");
//        shop.printShoppingList();
//        shop.modifyShoppingList(1, "alex");
//        shop.printShoppingList();
//        shop.removeShoppingItem(2);
//        shop.printShoppingList();
//        shop.findMyItem("Frssank");

    }
    public static void printInstructions () {
        System.out.println("\nOptions");
        System.out.println("\t0- Print choice options");
        System.out.println("\t1- Print shopping list");
        System.out.println("\t2- Add item");
        System.out.println("\t3- Modify item");
        System.out.println("\t4- Remove item");
        System.out.println("\t5- Search item");
        System.out.println("\t6- Quit application");
    }

    //in add item we just passed the item we wanted to add and left the rest to the grocery list class, and the class does the hard work.


    public static void addItem () {
        System.out.println("Please enter the item you would like to add: ");
        shoppingList.addShoppingItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Please enter item number");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter its replacement");
        String replacement = scanner.nextLine();
        shoppingList.modifyShoppingList(itemNumber-1,replacement);
    }



    public static void removeItem() {
        System.out.println("Position of item to remove:");
        shoppingList.removeShoppingItem((scanner.nextInt())-1);
    }

    public static void searchItem() {
        System.out.println("Item to find:");
        String itemFound = shoppingList.findMyItem(scanner.nextLine());
          if (itemFound == null ) {
              System.out.println("This item was not found in your grocery list");
          }  else {
              System.out.println("We found " + itemFound + " in your shopping list");

          }
    }

}







