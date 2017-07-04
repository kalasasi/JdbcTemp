package test.com.revature.model;

import java.time.LocalDate;

import org.apache.log4j.Logger;

import com.revature.model.BookSales;

public class TestBookSales {
	final static Logger logger = Logger.getLogger(TestBookSales.class);
	public static void main(String[] args) {
		BookSales bookSales1 = new BookSales();
		
		bookSales1.setSalesID(1001);
		bookSales1.setUserID(101);
		bookSales1.setIsbn(9788700631625l);
		bookSales1.setQuantity(3);
		bookSales1.setPrice(250.00);
		bookSales1.setTotalAmount(bookSales1.getPrice() * bookSales1.getQuantity());
		bookSales1.setOrderDate(LocalDate.parse("2017-06-06"));
		bookSales1.setStatus("Shipped");
		
		logger.info("Sales ID = " + bookSales1.getSalesID());
		logger.info("User ID = " + bookSales1.getUserID());
		logger.info("ISBN = " + bookSales1.getIsbn());
		logger.info("Quantity = " + bookSales1.getQuantity());
		logger.info("Price = " + bookSales1.getPrice());
		logger.info("Total Amount = " + bookSales1.getTotalAmount());
		logger.info("Order Date = " + bookSales1.getOrderDate());
		logger.info("Status = " + bookSales1.getStatus());
	}
}
