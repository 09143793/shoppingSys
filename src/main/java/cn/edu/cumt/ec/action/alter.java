package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.UserDaoJDBCImpl;
import cn.edu.cumt.ec.service.UserService;

public class alter extends ActionSupport {
	private String username;
	private String oldpassword;
	private String newpassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOldpassword() {
		return oldpassword;
	}
	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String execute() throws Exception{
		UserDaoJDBCImpl userdaojdbcimpl=new UserDaoJDBCImpl();
		UserService userService=new UserService();
		userService.setUserDao(userdaojdbcimpl);
		if(userService.alterPassword(getUsername(), getOldpassword(), getNewpassword())==true){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}

}
