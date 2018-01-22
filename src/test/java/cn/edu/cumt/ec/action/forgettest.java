package cn.edu.cumt.ec.action;

import static org.junit.Assert.*;

import org.junit.Test;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.cumt.ec.dao.UserDaoJDBCImpl;
import cn.edu.cumt.ec.entity.User;
import cn.edu.cumt.ec.service.UserService;

public class forgettest {

@Test

public void execute(){
	clearErrorsAndMessages();
	UserDaoJDBCImpl userdaoimpl=new UserDaoJDBCImpl();
	UserService userService=new UserService();
	userService.setUserDao(userdaoimpl);
	User u =userService.findPassword("1");
	if(u != null && u.getUsername()!= null){
		if(u.getUsername().equals("2")){
			System.out.println("ÄúµÄÃÜÂëÊÇ"+u.getPassword());
			ActionContext.getContext().getSession().put("password", u.getPassword());
		    
		}
		else{ 
			System.out.println("success");
			}
	}
	else{
		System.out.println("error");
	}
}

private void clearErrorsAndMessages() {
	// TODO Auto-generated method stub
	
}

}
