package cn.edu.cumt.ec.action;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.edu.cumt.ec.dao.UserDaoJDBCImpl;
import cn.edu.cumt.ec.service.UserService;

public class alterTest {
		@Test
		public void execute() throws Exception{
			UserDaoJDBCImpl userdaojdbcimpl=new UserDaoJDBCImpl();
			UserService userService=new UserService();
			userService.setUserDao(userdaojdbcimpl);
			if(userService.alterPassword("1", "2", "3")==true){
				System.out.println("success");
			}else{
				System.out.println("error");
			}
			
		}


}
