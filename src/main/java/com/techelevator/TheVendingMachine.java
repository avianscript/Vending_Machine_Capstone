package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TheVendingMachine extends VendingMachineCLI {
    //Instance Variables
    private Map<String, String> allItems;
    private int balance;

    //


    Scanner menuList = new Scanner(System.in);

    public TheVendingMachine(Menu menu) throws FileNotFoundException {
        super(menu);

    }
//    public static Map getItemList() throws FileNotFoundException {
//        Map<String, String> itemList = new HashMap<>();
//        File csvFile = new File("vendingmachine.csv");

//        try (Scanner fileInput = new Scanner(csvFile)) {
//            int lineCount = 0;
//            while (fileInput.hasNextLine()) {
//                String itemInfo = fileInput.nextLine();
//                itemList.put(itemInfo, "");
//                lineCount++;
//
//            }
//
//        } catch (FileNotFoundException exception) {
//            System.out.println("File not found");
//        }
//        return itemList;
    public static void displayItems() {

        ArrayList itemList2 = new ArrayList();
        File csvFile = new File("vendingmachine.csv");

        try (Scanner fileInput = new Scanner(csvFile)) {
            int lineCount = 0;
            while (fileInput.hasNextLine()) {
                String itemInfo = fileInput.nextLine();

                String[] moreInfo = new String[4];
                moreInfo = itemInfo.split("\\|");

                itemList2.add(itemInfo);
                lineCount++;

                System.out.println(Arrays.toString(moreInfo));
            }

        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }

    }

}