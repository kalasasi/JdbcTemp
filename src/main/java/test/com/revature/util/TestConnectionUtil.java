package test.com.revature.util;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.util.ConnectionUtil;
 
public class TestConnectionUtil {
	final static Logger logger = Logger.getLogger(TestConnectionUtil.class);
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		logger.info(jdbcTemplate);
	}	
}

