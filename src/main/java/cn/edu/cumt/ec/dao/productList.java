package cn.edu.cumt.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Cart;

public class productList {
	//获得所有商品信息

			public ArrayList<Cart> getAll() {
				Connection conn=null;
				PreparedStatement stmt=null;
				ResultSet rs=DbUtil.executeQuery("select * from cart", new Object[]{});
				ArrayList<Cart> list=new ArrayList<Cart>();
				try{
					conn=DbUtil.getConnection();
					String sql="select * from cart where gid=?;";
					stmt=conn.prepareStatement(sql);			
					rs=stmt.executeQuery();
					while(rs.next()){
						Cart cart = new Cart();
						
						cart.setName(rs.getString(2));
						cart.setPrice(rs.getString(3));
						list.add(cart);
					}
				}catch(SQLException e){
					e.printStackTrace();
				}
				return list;
			}					

			public List<Cart> getCart(String username) {
				
				ResultSet rs=DbUtil.executeQuery("select * from cart where username=? ", new Object[]{username});
				List<Cart> cartList=new ArrayList<Cart>();
				try{
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
			public Cart getById(int ID) {
				Connection conn = null;
				PreparedStatement stmt = null;
				ResultSet rs=DbUtil.executeQuery("select * from cart where id=?", new Object[]{ID});
				Cart product=null;
				try{
					conn =DbUtil.getConnection();
					String sql = "select * from cart where ID=?;"; // SQL语句
					stmt = conn.prepareStatement(sql);
					stmt.setInt(1,ID);
					rs = stmt.executeQuery();
					while(rs.next()){
						product=new Cart();
					
						product.setName(rs.getString(2));
						product.setPrice(rs.getString(3));
						
					}
				}catch(SQLException e){
					e.printStackTrace();
				}
				return product;
		}
			
}
