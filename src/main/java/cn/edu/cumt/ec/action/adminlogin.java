package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

public class adminlogin extends ActionSupport {
	private String adminname;
	private String password;
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception{
		if(getAdminname().equals("abc")&&getPassword().equals("123456")){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
		
	}
}
