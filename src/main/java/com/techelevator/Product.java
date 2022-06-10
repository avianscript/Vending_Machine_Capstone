package com.techelevator;

import java.util.ArrayList;

public class Product {
    ArrayList<String[]> productList = new ArrayList<>();
    public ArrayList makeList () {

        productList.add(new String[] {"A1", "Potato Crisps", "305", "Chip"});

                return productList;
    }
    //Instance Variables
    private String location;
    private String name;
    private int price;
    private String type;
    private String sound;
    private int quantity = 5;

    //constructor
//    public TheVendingMachine(String location,String name, int price, String type, String sound, int quantity) {
//        this.location = location;
//        this.name = name;
//        this.price =price;
//        this.type = type;
//        this.sound = sound;
//        this.quantity = quantity;
//
//
//    }

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


}
