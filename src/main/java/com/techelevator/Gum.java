package com.techelevator;


public class Gum extends TheVendingMachine {

    public Gum(String location, String name, int price, String type, String sound, int quantity) {
        super(location, name, price, type, sound, quantity);
    }



    Gum d1 = new Gum("D1","U-Chews", 85, "Gum", "Chew Chew, Yum!",5 );
    Gum d2 = new Gum("D2","Little League Chew", 95, "Gum", "Chew Chew, Yum!",5 );
    Gum d3 = new Gum("D3","Chiclets", 75, "Gum", "Chew Chew, Yum!",5 );
    Gum d4 = new Gum("D4","Triplemint", 75, "Gum", "Chew Chew, Yum!",5 );

}
