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

       // Map<String, String> itemList = new HashMap<>();
//        File csvFile = new File("vendingmachine.csv");

//        try (Scanner fileInput = new Scanner(csvFile)) {
//            int lineCount = 0;
//            while (fileInput.hasNextLine()) {
//                String itemInfo = fileInput.nextLine();
//                itemList.put(itemInfo, "");
//                lineCount++;
//            }
//
//        } catch (FileNotFoundException exception) {
//            System.out.println("File not found");
//        }
//        System.out.println(itemList + "T");

//        ArrayList itemList = new HashMap<>();
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

//        System.out.println(itemList2.get(2));
//        System.out.println(itemList2);
//        System.out.println(itemList2.get(0));
//



//        ArrayList finalArr = new ArrayList();
//        try (Scanner fileInput = new Scanner(csvFile)) {
//            int lineCount = 0;
//            while (fileInput.hasNextLine()) {
//                String itemInfo = fileInput.nextLine();
//                finalArr.add(itemInfo.split(""));
//                lineCount++;
//            }
//
//        } catch (FileNotFoundException exception) {
//            System.out.println("File not found");
//        }
//
//        System.out.println(finalArr);
    }
}


//        public static Map<> getItemList (){
//            Map<String, String> itemList = new HashMap<>();
//            File csvFile = new File("vendingmachine.csv");
//
//            try (Scanner fileInput = new Scanner(csvFile)) {
//                int lineCount = 0;
//                while (fileInput.hasNextLine()) {
//                    String itemInfo = fileInput.nextLine();
//                    itemList.put(itemInfo, "");
//                    lineCount++;
//
//                }
//
//            } catch (FileNotFoundException exception) {
//                System.out.println("File not found");
//            }
//            return itemList;
//        }



