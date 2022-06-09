package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class TheVendingMachine extends VendingMachineCLI {

    static Scanner scanner = new Scanner(System.in);

    TheVendingMachine vendingMachine;

    //Instance Variables
    public static int balance = 0;
    public ArrayList products = new ArrayList();
    public int change;

    //Constructor
    public TheVendingMachine(Menu menu, int balance) throws FileNotFoundException {
        super(menu);
        this.balance = balance;
        this.products = products;
    }

    //getters
    public int getBalance(){
        return balance;
    }

    public ArrayList getProducts() {
        return products;
    }

    public int getChange() {
        return change;
    }


    //setters






//methods

    }





