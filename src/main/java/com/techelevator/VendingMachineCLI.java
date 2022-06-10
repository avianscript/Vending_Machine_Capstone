package com.techelevator;

import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class VendingMachineCLI {


	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE};

	private Menu menu;

private TheVendingMachine aVendingMachine;

	public VendingMachineCLI(Menu menu, TheVendingMachine aVendingMachine) {
		this.menu = menu;
		this.aVendingMachine = aVendingMachine;
	}



	public void run() throws FileNotFoundException{

//		Chip a1 = new Chip("A1","Potato Crisps", 305, "Chip", "Crunch Crunch, Yum!",5);

		TheVendingMachine theVendingMachine = new TheVendingMachine();
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
//				TheVendingMachine.displayItems();
//				System.out.println(Candy.);
				System.out.println(theVendingMachine.loadData());
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase

				while (true) {
					//TheVendingMachine.displayPurchaseMenu();
				}

			}
		}
	}

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		Menu menu = new Menu(System.in, System.out);
		TheVendingMachine theVendingMachine = new TheVendingMachine();
		VendingMachineCLI cli = new VendingMachineCLI(menu, theVendingMachine);
		cli.run();


	}



//		Chip a1 = new Chip("A1","Potato Crisps", 305, "Chip", "Crunch Crunch, Yum!",5);
//
//		TheVendingMachine theVendingMachine = new TheVendingMachine();
//
//		System.out.println(a1.getPrice());



//	}
//
//	public String getUserInput(int selection) throws FileNotFoundException {
//		String userInputMainMenu = input.nextLine();
//
//
//			System.out.println("Hello There");
//
//		return "Somethin else";
//	}


}
