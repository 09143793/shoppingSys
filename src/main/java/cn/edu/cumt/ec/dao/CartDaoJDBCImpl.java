package cn.edu.cumt.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Cart;


public class CartDaoJDBCImpl implements CartDao {
	//加入
	@Override
	public boolean add(Cart cart) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into cart values(?,?,?,?,?,?,?)", new Object[]{cart.getId(),cart.getName(),
			cart.getNum(),cart.getPrice(),});


	}

	@Override
	public boolean update(Cart oldCart, Cart newCart) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("update cart set num=? where username=? and cid=?", new Object[]{newCart.getNum(),oldCart.getId()});
	}

	@Override
	public boolean delete(Cart cart) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from cart where id=?", new Object[]{cart.getId()});
	}




	@Override
	public Cart find(String username,String id) {
		// TODO Auto-generated method stub
		Cart cart = null;
		try{
			ResultSet rs=DbUtil.executeQuery("select * from cart where username=? and id=?", new Object[]{username,id});
			while(rs.next()){
				cart = new Cart();
				
				cart.setName(rs.getString(3));
				
				cart.setPrice(rs.getString(5));
				
			}
				}catch(Exception e){
					e.printStackTrace();
					}		
			return cart;
	}

	@Override
	public List<Cart> getByusername(String username) {
		// TODO Auto-generated method stub
		List<Cart> cartList=new ArrayList<Cart>();
		try{
			ResultSet rs= DbUtil.executeQuery("select * from cart where username=?", new Object[]{username});
			while(rs.next()){
				Cart cart = new Cart();
			
				cart.setName(rs.getString(2));				
				cart.setPrice(rs.getString(3));
				
				cartList.add(cart);
			}					
		}catch(SQLException e){
			e.printStackTrace();
		}
		return cartList;
	}

	@Override
	public Cart getId(String id) {
		// TODO Auto-generated method stub
		Cart cart = null;
		try{
			ResultSet rs=DbUtil.executeQuery("select * from cart where id=?", new Object[]{id});
			while(rs.next()){
				cart = new Cart();
				cart.setName(rs.getString(2));				
				cart.setPrice(rs.getString(3));
				
			}
				}catch(Exception e){
					e.printStackTrace();
					}		
			return cart;

	}
	//或得所有购物车讯息

	@Override
	public ArrayList<Cart> getAllCart() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Cart> list = new ArrayList<Cart>(); // 商品集合
		try {
			conn = DbUtil.getConnection();
			String sql = "select * from cart;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Cart cart = new Cart();
				cart.setId(rs.getInt("id"));
				cart.setName(rs.getString("name"));
				cart.setPrice(rs.getString("price"));
				cart.setCount(rs.getString("count"));
				list.add(cart);// 把一个商品加入集合
			}
			return list; // 返回集合。
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			// 释放数据集对象
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// 释放语句对象
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}

	}

	@Override
	public Cart getCartById(int id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConnection();
			String sql = "select * from cart where id=?;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Cart cart=new Cart();
				cart.setId(rs.getInt(1));
				cart.setName(rs.getString(2));
				cart.setPrice(rs.getString(3));
				cart.setNum(rs.getString(4));
				cart.setCount(rs.getString(5));
				return cart;
			} else {
				return null;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			// 释放数据集对象
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// 释放语句对象
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		}
	}

}
