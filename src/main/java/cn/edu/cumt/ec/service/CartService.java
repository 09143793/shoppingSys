package cn.edu.cumt.ec.service;

import java.util.List;

import cn.edu.cumt.ec.dao.CartDao;
import cn.edu.cumt.ec.dao.CartDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Cart;

 public class CartService {
	
	private CartDaoJDBCImpl cartDao = new CartDaoJDBCImpl();
	
	public CartService(){
		cartDao=new CartDaoJDBCImpl();
	}
	public CartDao getCartDao() {
		return cartDao;
	}

	public void setCartDao(CartDaoJDBCImpl cartDao) {
		this.cartDao = cartDao;
	}
	public boolean add(Cart cart){
		return cartDao.add(cart);
	}
	
	public boolean update(Cart oldCart,Cart newCart){
		return cartDao.update(oldCart, newCart);
	}
	public boolean delete(Cart cart){
		return cartDao.delete(cart);
	}
	public List<Cart> getByUsername(String username){
		return cartDao.getByusername(username);
	}
	public Cart find(String username,String id){
		return cartDao.find(username, id);
	}
	public Cart getCid(String id){
		return cartDao.getId(id);
	}

}