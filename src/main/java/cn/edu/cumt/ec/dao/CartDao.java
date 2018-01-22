package cn.edu.cumt.ec.dao;

import java.util.ArrayList;
import java.util.List;
import cn.edu.cumt.ec.entity.Cart;


public interface CartDao {
	
	public boolean add(Cart cart);
	public boolean update(Cart oldCart,Cart newCart);
	public boolean delete(Cart cart);
	public List<Cart> getByusername(String username); 
	public Cart find(String username,String id);//ID用户ID，id商品编号
	public Cart getId(String id);
	// 获得所有的商品信息
			public ArrayList<Cart> getAllCart() ;
			// 根据商品编号获得商品资料
			public Cart getCartById(int id);

}
