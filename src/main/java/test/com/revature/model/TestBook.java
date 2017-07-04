package test.com.revature.model;

import java.time.LocalDate;

import org.apache.log4j.Logger;

import com.revature.model.Book;

public class TestBook {
	final static Logger logger = Logger.getLogger(TestBook.class);
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setIsbn(9788700631625l);
		book1.setTitle("Harry potter");
		book1.setAuthor("JK rowling");
		book1.setPublishDate(LocalDate.parse("1990-12-01"));
		book1.setContent("Harry potter is an novel collection of wizards and witches in hogwards school");
		book1.setPrice(1200);
		book1.setStatus("published");
		
		logger.info(book1.toString());
	}
}
