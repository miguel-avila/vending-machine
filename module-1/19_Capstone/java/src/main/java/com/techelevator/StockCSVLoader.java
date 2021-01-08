package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.Candy;
import com.techelevator.Beverages;
import com.techelevator.Chips;
import com.techelevator.Gum;

//load inventory and update inventory 

public class StockCSVLoader {
 
	private File inputFile;

	public StockCSVLoader(File inputFile) {
		this.inputFile = inputFile;
	}

//	protected
	
	// NOTE this changed to protected here to facilitate testing!
		protected Item convertLineIntoItem(String line) {
			String[] components = line.split("\\|");

			if(components.length != 4) {
				return null;
			}
			
			String slotId = components[0].trim();
			String name = components[1].trim();
			String price = components[2].trim();
			String itemType = components[3].trim();
			
			
			if(itemType.toLowerCase().equals("Candy")) {
				Candy candy = new Candy();
				candy.setSlotId(slotId);
				candy.setName(name);
				candy.setPrice(new BigDecimal(price));
				candy.setItemType(itemType);
				
				return candy;                                     
				
			} else if(itemType.toLowerCase().equals("Chips")) {
				Chips chips = new Chips();
				chips.setSlotId(slotId);
				chips.setName(name);
				chips.setPrice(new BigDecimal(price));
				chips.setItemType(itemType);
				
				return chips;
				
			} else if (itemType.toLowerCase().equals("Beverages")){
				Beverages beverages = new Beverages();
				beverages.setSlotId(slotId);
				beverages.setName(name);
				beverages.setPrice(new BigDecimal(price));
				beverages.setItemType(itemType);
				return beverages;
				
			} else if (itemType.toLowerCase().equals("Gum")){
				Gum gum = new Gum();
				gum.setSlotId(slotId);
				gum.setName(name);
				gum.setPrice(new BigDecimal(price));
				gum.setItemType(itemType);
				return gum;
				
			} else {
				return null;
			}
		}
		public Map<String, Item> loadVendingMachine() {
			// make a new map
			Map<String, Item> vendingMachine = new HashMap<String,Item>();
			
			// read the file
			try(Scanner fileScanner = new Scanner(this.inputFile)){
				// for each item in the file
				
				//ASK ANDREW OR JOE Meaning of LineNumber++
				int lineNumber = 1;
				while(fileScanner.hasNextLine()) {
					// get the line from the scanner
					String line = fileScanner.nextLine();
					Item p = convertLineIntoItem(line);
					//        add the object into my map at the appropriate index
					if(p != null) {
						vendingMachine.put(p.getSlotId(), p);
					}
					
					lineNumber++;
				}	
			} catch (FileNotFoundException fnf) {
				return null;
			}
			
			return vendingMachine;
		}

}



