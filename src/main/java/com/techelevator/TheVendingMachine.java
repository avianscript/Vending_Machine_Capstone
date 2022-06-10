package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
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


    //Constructor

    public TheVendingMachine(String location,String name, int price, String type, String sound, int quantity) {
        this.location = location;
        this.name = name;
        this.price =price;
        this.type = type;
        this.sound = sound;
        this.quantity = quantity;


    }

    public TheVendingMachine(Menu menu) {
    }

    public TheVendingMachine() {

    }

    //getters

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

    public void test() {
        System.out.println();
        getPrice();
    }

    }





