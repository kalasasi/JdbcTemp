package com.revature.dao;


import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.model.BookInventory;
import com.revature.util.ConnectionUtil;

public class BookInventoryDAO {
	final static Logger logger = Logger.getLogger(BookInventoryDAO.class);
	/* Admin can increase the quantity of Books */
	
	public void increaseQuantity(BookInventory bookInventory) throws Exception {
		
		// 1. Get the connection
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
 
        // 2. Query
		String sql = "update bookInventory set quantity = ? where isbn = ?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, bookInventory.getQuantity(), bookInventory.getIsbn());
		logger.info("No. of rows Updated : " + rows);
	}
	
	/* Once the stock is not available, user should not be able to place an order */

	public void availableStock(BookInventory bookInventory) throws Exception {
		
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
 
        // 2. Query
		String sql = "update bookSales set status = 'Out of stock' where ((select quantity from bookInventory where isbn = ?) > 0)";
		
		// 3. Set the input and Query execute 
		try {
			int rows = jdbcTemplate.update(sql, bookInventory.getIsbn());
			logger.info("No of rows inserted: " + rows);
			throw new Exception("OUT OF STOCK");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

