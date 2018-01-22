package cn.edu.cumt.ec.action;


import com.opensymphony.xwork2.ActionSupport;
import cn.edu.cumt.ec.dao.WishDaoJDBCImpl;
import cn.edu.cumt.ec.entity.User;
import cn.edu.cumt.ec.entity.Wish;
import cn.edu.cumt.ec.service.UserService;
import cn.edu.cumt.ec.service.WishService;

public class addWish extends ActionSupport {
	private  Integer wishId;
	private String name;
	private String price;
	private String image;
	public Integer getWishId() {
		return wishId;
	}
	public void setWishId(Integer wishId) {
		this.wishId = wishId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String execute() throws Exception{
		WishDaoJDBCImpl wishdaojdbcimpl=new WishDaoJDBCImpl();
		WishService wishService=new WishService();
		wishService.setWishDao(wishdaojdbcimpl);
		Wish wish=new Wish();
	    wish.setWishId(wishId);
	    wish.setName(name);
	    wish.setPrice(price);
	    wish.getImage();
	    boolean b1=wishService.add(wish);
	     return SUCCESS; 		
	}

}
