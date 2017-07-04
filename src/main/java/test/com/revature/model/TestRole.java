package test.com.revature.model;

import org.apache.log4j.Logger;

import com.revature.model.Role;

public class TestRole {
	final static Logger logger = Logger.getLogger(TestRole.class);
	public static void main(String[] args) {
		Role role1 = new Role();
		
		role1.setId(200);
		role1.setRoleName("Author");
		
		logger.info("ID = " + role1.getId());
		logger.info("Role Name = " + role1.getRoleName());
	}
}
