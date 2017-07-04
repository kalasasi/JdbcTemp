package com.revature.dao;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.model.BookRatings;
import com.revature.util.ConnectionUtil;

public class BookRatingsDAO {
	final static Logger logger = Logger.getLogger(BookRatingsDAO.class);
	/* Users can provide ratings for the book */
	
	public void addRating(BookRatings bookRatings) throws Exception {
		// Step 1:Get the connection
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        
        // Step 2: Query
		String sql = "update bookRatings set rating = ? where isbn = ?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, bookRatings.getRating(), bookRatings.getIsbn());
		logger.info("No of rows updated : " + rows);
	}
}
