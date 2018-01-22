package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Items;

public class AdminDaoJDBCImpl implements AdminDao{

	@Override
	public boolean tianjia(int id,  String name, String categoryID, int price,int number,String picture,String picture1) {
		boolean SGIN = DbUtil.executeUpdate("insert into items values(?,?,?,?,?,?,?)",
				new Object[] { id, name, categoryID, price, number,picture,picture1 });
		if (SGIN == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean shanchu(int id) {
		boolean SGIN = DbUtil.executeUpdate("delete from items where id=?",new Object[] { id });
		if (SGIN == true) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
    public boolean alterItem(int id,String newname, String newcategoryID,int newprice,int newnumber,String newpicture,String newpicture1){
		ResultSet rs=DbUtil.executeQuery("select * from items where id=? ",new Object[]{id});
		Items items=null;
		try{
			while(rs.next()){
				items=new Items();
				items.setId(rs.getInt(1));
				items.setName(rs.getString(2));
				items.setCategoryID(rs.getString(3));
				items.setPrice(rs.getInt(4));
				items.setNumber(rs.getInt(5));
				items.setPicture(rs.getString(6));	
				items.setPicture1(rs.getString(7));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		boolean xgsh=DbUtil.executeUpdate("update items set name=?,categoryID=?,price=?,number=?,picture=?,picture1=?"+"where id=?", 
				new Object[]{newname,newcategoryID,newprice,newnumber,newpicture,newpicture1,items.getId()});
			if(xgsh==true){
				return true;
			}
			else{
				return false;
			}
		}
		
	}

	
