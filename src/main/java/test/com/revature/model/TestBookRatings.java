package test.com.revature.model;

import org.apache.log4j.Logger;

import com.revature.model.BookRatings;

public class TestBookRatings {
	final static Logger logger = Logger.getLogger(TestBookRatings.class);
	public static void main(String[] args) {
		
		BookRatings bookratings1 = new BookRatings();
		bookratings1.setIsbn(9788700631625l);
		bookratings1.setUserID(101);
		bookratings1.setRating(4.5);
		
		logger.info("ISBN = " + bookratings1.getIsbn());
		logger.info("User ID = " + bookratings1.getUserID());
		logger.info("Ratings = " + bookratings1.getRating());
	}
}
