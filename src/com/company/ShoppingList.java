package com.company;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<String> shoppingList = new ArrayList<String>();

    public void addShoppingItem(String item) {
        shoppingList.add(item);
    }


    public void printShoppingList() {
        System.out.println("You have " + shoppingList.size() + " Items in list");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }

    public void modifyShoppingList(int position, String newItem) {
        shoppingList.set(position, newItem);
        System.out.println("Shopping item " + (position + 1) + " has been modified.");
    }

    public void removeShoppingItem(int position) {
        String item = shoppingList.get(position);
        shoppingList.remove(position);
        System.out.println("Shopping item " + (position + 1) + " has been removed.");
    }
//    You can do remove(position) or remove(string)

    public String findMyItem(String searchItem) {
        int position = shoppingList.indexOf(searchItem);
        if (position >= 0) {
//            System.out.println(shoppingList.get(position));
            return shoppingList.get(position);
        }
//            System.out.println("null");
            return null;
    }
}

//NOTES:

//    private int[] myNumbers = new int[50];    --> myNumbers[5] = 4;
//private ArrayList<String > shoppingList = new ArrayList<String>();     --> shoppingList.add(item)


//With arraylists we don't define the data type, ie int[] array of integers.
//ArrayLists can hold objects so need to tell it what kind of data going into it  <String>
//ArrayList is a class, integer is just a primitive type.
//We don't need to specify the number of elements as the arrayList handles that for us automatically. Java does the hard work of growing automatically when new elements added.

 //  Need to call a method that is part of the arraylist CLASS to add our item (.add)
//  Need to call a method that is part of the arraylist class to determine the size  (.size) (.length property determined no. elements in an array)
//  Use .get method to access a particular element (.get)
//  .remove, removes an item at that position

// printShoppingList() --> Iterating through using an arraylist as opposed to traditional array used previously.
//ModifyShoppingList -->  +1 as humans start counting from 1, but computer from 0

//Command and then click on contains and gives you the notes for it!!! contain, true if finds and false if doesn't.

//    boolean exists = shoppingList.contains(searchItem);  --> gives trye or false depending whether it contains the item
//      IndexOf -->  Returns the index of the first occurrence of the specified element, or -1 if list doesn't contain the element.



