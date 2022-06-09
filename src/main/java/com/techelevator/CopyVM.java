package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CopyVM {

    static Scanner scanner = new Scanner(System.in);


    //Instance Variables
    //private Map<String, String> allItems;
    public static int balance = 0;
    //private Collection;



    public TheVendingMachine(Menu menu, int balance) throws FileNotFoundException {
        super(menu);
        this.balance = balance;
        //Collection

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
                System.out.println(moreInfo[1]);
            }

        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }

    }


//    Scanner scanner = new Scanner(System.in);

    public static void displayPurchaseMenu() {


        System.out.println("Current Balance: " + balance);
        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
        System.out.print("Please Choose An Option: ");
        String selection = scanner.nextLine();
        if (selection.equals("1")) {
            System.out.print("Please insert money: ");
            String fedMoney = scanner.nextLine();
            balance += Integer.parseInt(fedMoney);
            System.out.println(balance);
        } else if (selection.equals("2")) {
            displayItems();
            System.out.println("Please choose a product: ");
            String productSelection = scanner.nextLine();
            System.out.println("Here's your product");
        } else if (selection.equals("3")) {
            // give change
            // reset balance
            System.out.println("Thank you!");
//            System.exit(0);

        }

//        String userInput = scanner.nextLine();
//        if (userInput.equals(1)) {
////
//        }
//
//        return balance;
//    }
//    balance += Integer.parseInt(userInput);
//    String userInput = scanner.nextLine();


//      private static int feedMoney() {


//    Scanner scanner = new Scanner(System.in);


//        int balance = 0;
//
//
////        System.out.println("please Insert Money");
//        String userInput = scanner.nextLine();
//        balance += Integer.parseInt(userInput);
//        return balance;
    }

}
