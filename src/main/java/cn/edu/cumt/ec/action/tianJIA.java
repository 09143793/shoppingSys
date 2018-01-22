package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.service.AdminService;


public class tianJIA extends ActionSupport {
	private int id; // 商品编号
	private String name; // 商品名称
	private String categoryID; // 产地
	private int price; // 价格
	private int number; // 库存
	private String picture;// 商品图片
	private String picture1;
	public String getPicture1() {
		return picture1;
	}
	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String execute() throws Exception{
		AdminService AdminService=new AdminService();
		if(AdminService.tianjia(getId(),getName(),getCategoryID(),getPrice(),getNumber(),getPicture(),getPicture1())==true){
			return SUCCESS;
			
			
		}else{
			return ERROR;
		}
	}

}
