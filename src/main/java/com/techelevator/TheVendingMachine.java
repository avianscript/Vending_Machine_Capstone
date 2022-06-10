package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;

public class TheVendingMachine {

    static Scanner scanner = new Scanner(System.in);

    TheVendingMachine vendingMachine;

    //Instance Variables

    private String location;
    private String name;
    private int price;
    private String type;
    private String sound;
    private int quantity = 5;
    private List inventoryList = new ArrayList();
    private String[] singleItem = new String[] {};
    //amount of change -> dispense change
    //String selection -> dispense selection
    //communicate change to quantity
    //money -> feed money


    //Constructor




//    public TheVendingMachine(String location,String name, int price, String type, String sound, int quantity, String inventoryList) {
//        this.location = location;
//        this.name = name;
//        this.price =price;
//        this.type = type;
//        this.sound = sound;
//        this.quantity = quantity;
//        this.inventoryList = inventoryList;
//



    public TheVendingMachine(Menu menu) {
    }

    public TheVendingMachine() {
        loadData();
    }

    //getters

    public List getInventoryList() {
        return inventoryList;
}

    public String[] getSingleItem() {
        return singleItem;
    }

    public void setSingleItem(String[] singleItem) {
        this.singleItem = singleItem;
    }

    public void loadData () {
        File csvFile = new File("vendingmachine.csv");

        try (Scanner fileInput = new Scanner(csvFile)) {
            while (fileInput.hasNextLine()) {
                String itemInfo = fileInput.nextLine();

                String[] moreInfo = new String[4];
                moreInfo = itemInfo.split("\\|");
                inventoryList.add(itemInfo);

            System.out.println(Arrays.toString(moreInfo));
//                System.out.println(moreInfo[1]);
//            singleItem = moreInfo;
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }
    }
    public void singleData () {
            File csvdFile = new File("vendingmachine.csv");

            try (Scanner fileInput = new Scanner(csvdFile)) {
                while (fileInput.hasNextLine()) {
                    String itemInfo = fileInput.nextLine();

                    String[] moreInfo = new String[4];
                    moreInfo = itemInfo.split("\\|");
                    inventoryList.add(itemInfo);

//            System.out.println(Arrays.toString(moreInfo));
                    System.out.println(moreInfo[3]);
//            singleItem = moreInfo;
                }
            } catch (FileNotFoundException exception) {
                System.out.println("File not found");
            }


        }



    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public int getQuantity() {
        return quantity;
    }
    //setters






    //methods

//    public static void arrListStored(){
//        ArrayList itemList2 = new ArrayList();
//        File csvFile = new File("vendingmachine.csv");
//
//        try (Scanner fileInput = new Scanner(csvFile)) {
//            int lineCount = 0;
//            while (fileInput.hasNextLine()) {
//                String itemInfo = fileInput.nextLine();
//
//                String[] moreInfo = new String[4];
//                moreInfo = itemInfo.split("\\|");
//                String location = moreInfo[0];
//                itemList2.add(itemInfo);
//                lineCount++;
//
//
//                System.out.println(Arrays.toString(moreInfo));
//                System.out.println(moreInfo[1]);
//            }
//
//        } catch (FileNotFoundException exception) {
//            System.out.println("File not found");
//        }
//
//    }

    public static void displayItems() {

        //pull from ArrayList


    }

    }





