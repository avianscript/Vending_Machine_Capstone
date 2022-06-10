package com.techelevator;

public class Drink extends TheVendingMachine {

    public Drink(String location, String name, int price, String type, String sound,int quantity ) {
        super(location, name, price, type, sound, quantity);
    }

    Drink c1 = new Drink("C1","Cola", 125, "Drink", "Glug Glug, Yum!", 5 );
    Drink c2 = new Drink("C2","Dr.Salt", 150, "Drink", "Glug Glug, Yum!",5 );
    Drink c3 = new Drink("C3","Mountain Melter", 150, "Drink", "Glug Glug, Yum!",5 );
    Drink c4 = new Drink("C4","Heavy", 150, "Drink", "Glug Glug, Yum!",5 );


}
