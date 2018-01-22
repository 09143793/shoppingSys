package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;
import cn.edu.cumt.ec.service.UserService;
import cn.edu.cumt.ec.dao.UserDaoJDBCImpl;
import cn.edu.cumt.ec.entity.User;

public class register extends ActionSupport{
private String username;
private String tel;
private String password;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getTel() {
	return tel;
}



public void setTel(String tel) {
	this.tel = tel;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public String execute() throws Exception{
	UserDaoJDBCImpl userdaojdbcimpl=new UserDaoJDBCImpl();
	UserService userService=new UserService();
	userService.setUserDao(userdaojdbcimpl);
	User user=new User();
    user.setUsername(username);
    user.setPassword(password);
    user.setTel(tel);
    boolean b1=userService.add(user);
    return SUCCESS;
}
}
