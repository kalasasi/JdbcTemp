package test.com.revature.dao;

import com.revature.dao.BookInventoryDAO;
import com.revature.model.BookInventory;

public class TestBookInventoryDAO {
	public static void main(String[] args) {
		BookInventory bookInventory = new BookInventory();
		bookInventory.setIsbn(9788700631625l);
		bookInventory.setQuantity(5);
		
		BookInventoryDAO bookInventoryDAO = new BookInventoryDAO();
		
		/*Admin can increase the quantity of Books */
		try {
			bookInventoryDAO.increaseQuantity(bookInventory);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Once the stock is not available, user should not be able to place an order */
		try {
			bookInventoryDAO.availableStock(bookInventory);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
