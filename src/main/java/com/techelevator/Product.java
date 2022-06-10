package com.techelevator;

import java.util.ArrayList;

public class Product extends TheVendingMachine {

    //Instance Variables
    private String location;
    private String name;
    private int price;
    private String type;
    private String sound;
    private int quantity = 5;

    //constructor

//    public Product() {
//
//    }

    public Product(String location,String name, int price, String type, String sound) {
        this.location = location;
        this.name = name;
        this.price =price;
        this.type = type;
        this.sound = sound;


    }



//    ArrayList<String []> products = new ArrayList<>() {};
//
//    public  ArrayList getProducts() {
//        products.add(new String[]{"A1","Potato Crisps", "305", "Chip", "Crunch Crunch, Yum!",});
//        products.add(new String[]{"A2","Stackers", "145", "Chip", "Crunch Crunch, Yum!"});
//        products.add(new String[]{"A3","Grain Waves", "275", "Chip","Crunch Crunch, Yum!"});
//        products.add(new String[]{"A4","Cloud Popcorn", "365", "Chip","Crunch Crunch, Yum!"});
//
//
//
//        return products;
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
