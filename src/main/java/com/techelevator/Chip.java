package com.techelevator;

import com.techelevator.view.Menu;

import javax.crypto.spec.PSource;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chip extends TheVendingMachine{


    public Chip(String location, String name, int price, String type, String sound, int quantity) {
        super(location, name, price, type, sound, quantity);

    }


    Chip a1 = new Chip("A1","Potato Crisps", 305, "Chip", "Crunch Crunch, Yum!",5);
    Chip a2 = new Chip("A2","Stackers", 145, "Chip", "Crunch Crunch, Yum!",5);
    Chip a3 = new Chip("A3","Grain Waves", 275, "Chip","Crunch Crunch, Yum!",5);
    Chip a4 = new Chip("A4","Cloud Popcorn", 365, "Chip","Crunch Crunch, Yum!",5);



}