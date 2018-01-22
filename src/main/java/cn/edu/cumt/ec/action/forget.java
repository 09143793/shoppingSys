package cn.edu.cumt.ec.action;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.UserDaoJDBCImpl;
import cn.edu.cumt.ec.entity.User;
import cn.edu.cumt.ec.service.UserService;

public class forget extends ActionSupport implements SessionAware , ApplicationAware {
	private String tel;
	private String username;
	private String password;
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		clearErrorsAndMessages();
		UserDaoJDBCImpl userdaoimpl=new UserDaoJDBCImpl();
		UserService userService=new UserService();
		userService.setUserDao(userdaoimpl);
		User u =userService.findPassword(getTel());
		if(u != null && u.getUsername()!= null){
			if(u.getUsername().equals(getUsername())){
				System.out.println("ÄúµÄÃÜÂëÊÇ"+u.getPassword());
				ActionContext.getContext().getSession().put("password", u.getPassword());
			    return SUCCESS;
			}
			else{ 
				return  ERROR;}
		}
		else{
			return  ERROR;
		}
	}
	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}

}
