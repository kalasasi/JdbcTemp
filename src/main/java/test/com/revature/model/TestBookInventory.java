package test.com.revature.model;

import org.apache.log4j.Logger;

import com.revature.model.BookInventory;

public class TestBookInventory {
	final static Logger logger = Logger.getLogger(TestBookInventory.class);
	public static void main(String[] args) {
		
		BookInventory bookInventory1 = new BookInventory();
		bookInventory1.setIsbn(9788700631625l);
		bookInventory1.setQuantity(5);
		
		logger.info("ISBN = " + bookInventory1.getIsbn());
		logger.info("Quantity = " + bookInventory1.getQuantity());
	}

}
