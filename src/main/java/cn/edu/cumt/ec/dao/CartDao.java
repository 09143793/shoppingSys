package cn.edu.cumt.ec.dao;

import java.util.ArrayList;
import java.util.List;
import cn.edu.cumt.ec.entity.Cart;


public interface CartDao {
	
	public boolean add(Cart cart);
	public boolean update(Cart oldCart,Cart newCart);
	public boolean delete(Cart cart);
	public List<Cart> getByusername(String username); 
	public Cart find(String username,String id);//ID�û�ID��id��Ʒ���
	public Cart getId(String id);
	// ������е���Ʒ��Ϣ
			public ArrayList<Cart> getAllCart() ;
			// ������Ʒ��Ż����Ʒ����
			public Cart getCartById(int id);

}
