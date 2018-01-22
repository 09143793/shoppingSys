package cn.edu.cumt.ec.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.CartDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Cart;
import cn.edu.cumt.ec.service.CartService;

public class Cartaction extends ActionSupport implements SessionAware, ApplicationAware ,ServletRequestAware,ServletResponseAware{
	private String id;//购物车购买的商品ID
    private String name;
    private String price;
    private Integer number;
    private String totalprice;
    private String username;//购买该商品的客户ID
    private String picture;//该商品的图片
	
	private Map<String, Object> session;
	private Map<String, Object> application;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	

	

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public Map<String, Object> getApplication() {
		return application;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}
	public String AddCart(){
		CartService cartService=new CartService();
		Cart i=cartService.find(username,id);
		if(i != null){
			i.setNum(i.getNum()+1);
			cartService.update(cartService.find(username, id), i);
			return SUCCESS;
		}
		else{
			Cart cart = new Cart();
		
			cart.setName(name);			
			cart.setPrice(price);
		
			cartService.add(cart);
			return ERROR;
		}
	
	}

		
			}

