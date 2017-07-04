package test.com.revature.model;

import org.apache.log4j.Logger;

import com.revature.model.User;

public class TestUser {
	final static Logger logger = Logger.getLogger(TestUser.class);
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(101);
		user1.setName("Sharan");
		user1.setUserName("sharan7797");
		user1.setPassword("sharan123");
		user1.setMobileNumber(9876549876l);
		user1.setEmailID("sharan@gmail.com");
		user1.setActive("A");
		user1.setRoleId(100);
		
		logger.info("ID = " + user1.getId());
		logger.info("Name = " + user1.getName());
		logger.info("UserName = " + user1.getUserName());
		logger.info("Password = " + user1.getPassword());
		logger.info("Mobile Number = " + user1.getMobileNumber());
		logger.info("Email ID = " + user1.getEmailID());
		logger.info("Active = " + user1.getActive());
		logger.info("Role ID = " + user1.getRoleId());
		
	}
}
