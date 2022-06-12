package com.techelevator;
//Please read the README Reflections doc
import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

	public class VendingMachineCLI {


		private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
		private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
		private static final String MAIN_MENU_OPTION_EXIT = "Exit";
		private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};

		private Menu menu;

		private TheVendingMachine aVendingMachine;

		public VendingMachineCLI(Menu menu, TheVendingMachine aVendingMachine) {
			this.menu = menu;
			this.aVendingMachine = aVendingMachine;
		}


		public void run() throws FileNotFoundException {
			Scanner scanner = new Scanner(System.in);
//		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items

				aVendingMachine.displayMenu();
				run();
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
//				while (true) {
//				TheVendingMachine.updateBalance();

				TheVendingMachine.displayPurchaseMenu();
				String userInput = scanner.nextLine();
				String userInput2 = "";
				if (userInput.equals("2")) {
					aVendingMachine.displayMenu();
					System.out.print("Please enter selection >>> ");
//					if (TheVendingMachine.getBalance() < TheVendingMachine.givePrice()) {
//						System.out.println("You have insufficient funds");
//						run();
				}
				System.out.println(aVendingMachine.givePrice());
				run();

//				while (userInput.equals("2")) {
//					TheVendingMachine.displayPurchaseMenu();
//					run();

//						TheVendingMachine.updateBalance();
				//						String userSelection = scanner.nextLine();
//						System.out.println("Price: " + aVendingMachine.givePrice());


			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				System.exit(0);
			}

	}

			Scanner input = new Scanner(System.in);

			public static void main (String[]args) throws FileNotFoundException {
				Menu menu = new Menu(System.in, System.out);
				TheVendingMachine theVendingMachine = new TheVendingMachine();
				com.techelevator.VendingMachineCLI cli = new com.techelevator.VendingMachineCLI(menu, theVendingMachine);
				cli.run();


			}

		}



