package com.techelevator.view;
import java.util.List;
import java.util.Map;

import com.techelevator.Inventory;
import com.techelevator.Item;
public class InventoryDisplay {
	
	public void display (Inventory inventory) {
		
		//Calling inventory for inventory class (
		//
		//
		for(Map.Entry<String,Item> entry : inventory.getInventory().entrySet()) {			
			System.out.println(entry.getKey() + " " + entry.getValue().getName()  + " " +  entry.getValue().getPrice()  + " " + entry.getValue().getItemType()); 
			
		
 		}
		
	}

}
