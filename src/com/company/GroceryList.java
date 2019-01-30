package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Type list for grocery");
        String item = scanner.next();

    }

    public void addGroceryList(String item) {
        groceryList.add(item);

    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " item in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item " + position + 1 + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
