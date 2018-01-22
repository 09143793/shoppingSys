package cn.edu.cumt.ec.action;



import org.junit.Test;

import cn.edu.cumt.ec.dao.UserDaoJDBCImpl;
import cn.edu.cumt.ec.entity.User;
import cn.edu.cumt.ec.service.UserService;

public class registerTest {

	@Test
	public void execute() throws Exception{
		UserDaoJDBCImpl userdaojdbcimpl=new UserDaoJDBCImpl();
		UserService userService=new UserService();
		userService.setUserDao(userdaojdbcimpl);
		User user=new User();
	    user.setUsername("1");
	    user.setPassword("2");
	    user.setTel("3");
	    boolean b1=userService.add(user);
	  System.out.println("success");
	}
	
}
	
	