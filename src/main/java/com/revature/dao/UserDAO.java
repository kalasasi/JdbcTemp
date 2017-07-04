package com.revature.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.model.User;
import com.revature.util.ConnectionUtil;

public class UserDAO {
	
	final static Logger logger = Logger.getLogger(UserDAO.class);
	/* New User Can Register */
	
	public void insertUser(User user) throws Exception {
        // 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
 
        // 2. Query
        String sql = "insert into user (id , name, username , password ,mobile_no , email_ID , active, user_roleId) values (?,?,?,?,?,?,?,?)";
        
        // 3. Set the input and Query execute
        int rows = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getUserName(), user.getPassword(), user.getMobileNumber(), user.getEmailID(), user.getActive(), user.getRoleId());
        logger.info("No of rows inserted: " + rows);	
    }
	
	/* User must be able to Login */
	public void loginUser(User user) throws Exception {
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		
        // 2. Query
        String sql = "select * from user where (userName= ?) and (password = ?)";
		
        // 3. Set the input and Query execute
        List<User>  users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class), user.getUserName(), user.getPassword());
        logger.info("Login Success ");
        logger.info("User Details : " + users);
	}
	
	/* User must be able to Reset Password */
	public void updatePassword(User user, String newPassword) throws Exception {
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		
        // 2. Query
		String sql = "update user set password = ? where ((username = ?) and (active = 'A')) and password=?";
		
		// 3. Set the input and Query execute
		int rows = jdbcTemplate.update(sql, newPassword, user.getUserName(), user.getPassword());
		System.out.println("No of rows inserted: " + rows);
		if (rows == 1) 	
			logger.info("Password Reset Sucess");
		else if (rows == 0) 
			logger.info("Please Login to reset");
		else 
			logger.info("Error Reset");
	}
}
