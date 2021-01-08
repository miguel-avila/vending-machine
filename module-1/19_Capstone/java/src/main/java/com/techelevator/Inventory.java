package com.techelevator;

import java.io.File;
import java.util.Map;

public class Inventory {

	//will be used for transaction and update inventory
	//Potentailly map 
private Map<String , Item> inventory;
	
//use CSV to load the items 
//
public void loadInventory(File file) {
	StockCSVLoader stockCSVLoader = new StockCSVLoader(file);
	inventory = stockCSVLoader.loadVendingMachine();
	
}

public Map<String , Item> getInventory() {
	return inventory;
}
	
	
	
}
