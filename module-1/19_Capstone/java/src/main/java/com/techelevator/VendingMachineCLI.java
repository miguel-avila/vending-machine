package com.techelevator;

import java.io.File;
import java.nio.file.Paths;

import com.techelevator.view.InventoryDisplay;
import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };
	private static final String CSV_FILE_PATH ="vendingmachine.csv";
	private Menu menu;
	private InventoryDisplay inventoryDisplay = new InventoryDisplay();
	
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		
		File file = new File(CSV_FILE_PATH);
		//creating new inventory object
		Inventory inventory = new Inventory();
		//load inventory
		inventory.loadInventory(file);

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
 
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
				inventoryDisplay.display(inventory);
				
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				
				
				
				// do purchase
			}  else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
		}
	}
}
	
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}

	public static String getCsvFilePath() {
		return CSV_FILE_PATH;
	}
}
