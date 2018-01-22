package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.AdminDaoJDBCImpl;
import cn.edu.cumt.ec.dao.UserDaoJDBCImpl;
import cn.edu.cumt.ec.service.AdminService;
import cn.edu.cumt.ec.service.UserService;

public class xiuGAI extends ActionSupport{
	private int id; // 商品编号
	private String newname; // 商品名称
	private String newcategoryID; // 产地
	private int newprice; // 价格
	private int newnumber; // 库存
	private String newpicture;
	private String newpicture1;
	
	public String getNewpicture1() {
		return newpicture1;
	}
	public void setNewpicture1(String newpicture1) {
		this.newpicture1 = newpicture1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNewname() {
		return newname;
	}
	public void setNewname(String newname) {
		this.newname = newname;
	}
	public String getNewcategoryID() {
		return newcategoryID;
	}
	public void setNewcategoryID(String newcategoryID) {
		this.newcategoryID = newcategoryID;
	}
	public int getNewprice() {
		return newprice;
	}
	public void setNewprice(int newprice) {
		this.newprice = newprice;
	}
	public int getNewnumber() {
		return newnumber;
	}
	public void setNewnumber(int newnumber) {
		this.newnumber = newnumber;
	}
	public String getNewpicture() {
		return newpicture;
	}
	public void setNewpicture(String newpicture) {
		this.newpicture = newpicture;
	}
	
	public String execute() throws Exception{
		AdminDaoJDBCImpl admindaojdbcimpl=new AdminDaoJDBCImpl();
		AdminService adminService=new AdminService();
		adminService.setAdminDao(admindaojdbcimpl);
		if(adminService.alterItem(getId(),getNewname(),getNewcategoryID(),getNewprice(),getNewnumber(),getNewpicture(),getNewpicture1())==true){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}
}
