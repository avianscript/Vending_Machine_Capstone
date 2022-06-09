package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Scratchpad {

    public static void main(String[] args) {
        //Instance Variables
        Map<String, String> allItems;
        int balance;


        Scanner menuList = new Scanner(System.in);


        ArrayList  itemList2 = new ArrayList();
        File csvFile = new File("vendingmachine.csv");

        try (Scanner fileInput = new Scanner(csvFile)) {
            int lineCount = 0;
            while (fileInput.hasNextLine()) {
                String itemInfo = fileInput.nextLine();

               String [] moreInfo = new String [4];
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




