package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TheVendingMachine extends VendingMachineCLI {

      static Scanner scanner = new Scanner(System.in);


    //Instance Variables
    private Map<String, String> allItems;
    private int balance;



    public TheVendingMachine(Menu menu, int balance) throws FileNotFoundException {
        super(menu);
        this.balance = balance;

    }

    public int getBalance() {
        return balance;
    }

//    Scanner scanner = new Scanner(System.in);

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


//    Scanner scanner = new Scanner(System.in);

    public static void displayPurchaseMenu() {


        System.out.println("Current Balance: " + feedMoney());
        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
        System.out.print("Please Choose An Option: ");

//        String userInput = scanner.nextLine();
//        if (userInput.equals(1)) {
////
//        }
//
//        return balance;
//    }
//    balance += Integer.parseInt(userInput);
//    String userInput = scanner.nextLine();


      private static int feedMoney() {


//    Scanner scanner = new Scanner(System.in);


        int balance = 0;


//        System.out.println("please Insert Money");
        String userInput = scanner.nextLine();
        balance += Integer.parseInt(userInput);
        return balance;
    }




 }