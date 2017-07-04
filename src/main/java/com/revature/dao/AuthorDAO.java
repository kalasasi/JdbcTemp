package com.revature.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.model.Book;
import com.revature.util.ConnectionUtil;


public class AuthorDAO {

	final static Logger logger = Logger.getLogger(AuthorDAO.class);
	public void insertBook(Book book) throws Exception {
	 
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// 2. Query
		String sql = "insert into book (isbn , title, author , publishDate ,content , price , status) values (?,?,?,?,?,?,?)";

		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPublishDate(), book.getContent(), book.getPrice(), book.getStatus());
		logger.info("No of rows inserted: " + rows);
	}

	/* Author can upload the contents of book */
	
	public void updateContent(Book book) throws Exception {
		
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// 2. Query
		String sql = "update book set `content`=? where `isbn`=?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, book.getContent(), book.getIsbn());
		logger.info("No. of rows Updated : " + rows);
	}

	/* Author can view the book and contents */
	
	public void viewBook(Book book) throws Exception {
		
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// 2. Query
		String sql = "select title,content from book where (isbn = ?)";
		
		// 3. Set the input and Query execute
		List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class), book.getIsbn());
		logger.info(books);;
	}

	/* Author can delete the book */
	
	public void deleteBook(Book book) throws Exception {
		
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// 2. Query
		String sql = "delete from book where isbn = ?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, book.getIsbn());
		logger.info("No. of rows Deleted : " + rows);
	}

	/* Author can view all his books */
	
	public void viewAllBooks(Book book) throws Exception {
		
		// Step 1:Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

		// Step 2: Query
		String sql = "select * from book where author = ?";
		
		// 3. Set the input and Query execute
		List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class), book.getAuthor());
		logger.info(books);;
	}

}
