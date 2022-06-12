package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;

public class TheVendingMachine {

    static Scanner scanner = new Scanner(System.in);

    TheVendingMachine vendingMachine;

    //Instance Variables

    private static ArrayList inventoryList = new ArrayList();
    //    private List singleItem = new ArrayList();
    private static int balance = 500;
//    private static String userSelection;

    public TheVendingMachine() {
        loadData();
//        getProducts();
//        singleData();
    }

    //getters

    public static ArrayList getInventoryList() {
        return inventoryList;
    }

    public static int getBalance() {
        return balance;
    }

//    public List getSingleItem() {
//        return singleItem;
//    }
//
//    public void setSingleItem(List singleItem) {
//        this.singleItem = singleItem;
//    }


    //loadData method puts the scanned csv into ArrayList format
    //so that individual items can be isolated into arrays and
    //then indexed to find the price
    public ArrayList loadData() {
        File csvFile = new File("vendingmachine.csv");
        try (Scanner fileInput = new Scanner(csvFile)) {
            while (fileInput.hasNextLine()) {
                String itemInfo = fileInput.nextLine();
                inventoryList.add(itemInfo);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }
        inventoryList.add("Reject|Reject|0.00|Reject");
        return inventoryList;
    }

    //givePrice method provides the selection's price in pennies
    public static int givePrice() {

        int selectionIndex = 0;
        String userSelection = scanner.nextLine();

        if (userSelection.equals("A1")) {
            selectionIndex = 0;
        } else if (userSelection.equals("A2")) {
            selectionIndex = 1;
        } else if (userSelection.equals("A3")) {
            selectionIndex = 2;
        } else if (userSelection.equals("A4")) {
            selectionIndex = 3;
        } else if (userSelection.equals("B1")) {
            selectionIndex = 4;
        } else if (userSelection.equals("B2")) {
            selectionIndex = 5;
        } else if (userSelection.equals("B3")) {
            selectionIndex = 6;
        } else if (userSelection.equals("B4")) {
            selectionIndex = 7;
        } else if (userSelection.equals("C1")) {
            selectionIndex = 8;
        } else if (userSelection.equals("C2")) {
            selectionIndex = 9;
        } else if (userSelection.equals("C3")) {
            selectionIndex = 10;
        } else if (userSelection.equals("C4")) {
            selectionIndex = 11;
        } else if (userSelection.equals("D1")) {
            selectionIndex = 12;
        } else if (userSelection.equals("D2")) {
            selectionIndex = 13;
        } else if (userSelection.equals("D3")) {
            selectionIndex = 14;
        } else if (userSelection.equals("D4")) {
            selectionIndex = 15;
        } else {
            System.out.println("Sorry, not a valid selection.");
            selectionIndex = 16;
            displayPurchaseMenu();

        }
        //get individual item by index from the inventory ArrayList
        String invString = (String) inventoryList.get(selectionIndex);
        //split individual item into an array of each attribute
        String[] invArray = invString.split("[|]");
        //Store price into a Double
        Double invArrayInt = Double.parseDouble(invArray[2]);
        //convert and return price as an int in pennies
        return (int) (invArrayInt * 100);

    }

    public static void updateBalance () {
        balance -= givePrice();
        System.out.println("Your balance is now " + balance);
    }

    //displayMenu method prints out the menu from the csv file
    public static void displayMenu() {
        File csvFile = new File("vendingmachine.csv");
        try (Scanner fileInput = new Scanner(csvFile)) {
            while (fileInput.hasNextLine()) {
                String itemInfo = fileInput.nextLine();
                System.out.println(itemInfo);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }
    }

    public static void displayPurchaseMenu() {

        System.out.println("Your current balance is " + balance);
        System.out.println("(1) Feed money" + "\n" + "(2) Make Selection" + "\n" + "(3) Finish transaction");
        System.out.print("Please choose an option >>> ");

    }
}