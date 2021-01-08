package com.techelevator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item {
	Map<String, Integer> inventoryItems = new HashMap<String, Integer>();
	
	
	
	
	public static void main(String[] args) {
		

		// list or map of items (ex: candy
		// or map of inventory slots

		// create parent class item

		// create methods prior to loading CSV (ex: Item, Price,

		// hold name, slot numbers, create var for price

		//

		// keep track of our inventory
		
		// load up our inventory
		inventoryItems.put("Beverages", 0);
		inventoryItems.put("Candy", 5);
		inventoryItems.put("Chips",5);
		inventoryItems.put("Gum", 5);

		// Prints the quantity of items in our inventory
		// System.out.println("We have " + inventoryItems.get("Beverages") + " Beverages
		// in stock");
		// System.out.println("We have " + inventoryItems.get("Candy") + " Candy in
		// stock");
		// System.out.println("We have " + inventoryItems.get("Chips") + " Chips in
		// stock ");
		// System.out.println("We have " + inventoryItems.get("Gum") + " Gum in stock");

		// if (inventoryItems.containsValue(0)) &&
		// (inventoryItems.containsKey("Candy")){
		// System.out.println("Candy is Sold out");

		// Checks inventory and displays quantity
		if (inventoryItems.containsKey("Beverages")) {
			System.out.println("We have " + inventoryItems.get("Beverages") + " Beverages");
		}
		if (inventoryItems.containsKey("Candy")) {
			System.out.println("We have " + inventoryItems.get("Candy") + " Candy");
		}
		if (inventoryItems.containsKey("Gum")) {
			System.out.println("We have " + inventoryItems.get("Gum") + " Gum");
		}

		if (inventoryItems.containsKey("Chips")) {
			if (inventoryItems.get("Chips").equals(0)) {
				System.out.print("Chips Sold out");
			}

			else {
				System.out.println("We have " + inventoryItems.get("Chips") + " Chips");
			}
		}

	}
}
