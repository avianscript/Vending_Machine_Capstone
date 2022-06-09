package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheVendingMachine {

    Scanner menuList = new Scanner(System.in);


    public static Map getItemList() throws FileNotFoundException {
        Map<String, String> itemList = new HashMap<>();
        File csvFile = new File("vendingmachine.csv");

        try (Scanner fileInput = new Scanner(csvFile)) {
            int lineCount = 0;
            while (fileInput.hasNextLine()) {
                String itemInfo = fileInput.nextLine();
                itemList.put(itemInfo, "");
                lineCount++;

            }

        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }
        return itemList;
    }
}






