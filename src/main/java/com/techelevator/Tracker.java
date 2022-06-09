package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tracker extends TheVendingMachine {

    public Tracker(Menu menu, int balance) throws FileNotFoundException {
        super(menu, balance);
    }

    public String[] getArray()  {
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
                System.out.println(moreInfo[2]);
            }
        }
        return moreInfo;
    }
}

