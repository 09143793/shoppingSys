package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.service.AdminService;

public class Shanchu extends ActionSupport  {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String execute() throws Exception{
		AdminService AdminService=new AdminService();
		if(AdminService.shanchu(id)==true){
			return SUCCESS;
			
			
		}else{
			return ERROR;
		}
	}
}
