package cn.edu.cumt.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Dingdan;
import cn.edu.cumt.ec.entity.Items;

public class DingdanDaoJDBCImpl implements DingdanDao {
	//注册 {
	//注册
			@Override
			public boolean add(Dingdan dingdan) {
			
				return DbUtil.executeUpdate("insert into dingdan values(?,?,?,?,?,?,?)",new Object[]{dingdan.getId(),dingdan.getUsername(),dingdan.getName(),dingdan.getShr(),dingdan.getAddress(),dingdan.getTel(),dingdan.getZt()});		
			}

			@Override
			// 获得所有的商品信息
			public ArrayList<Dingdan> getAllDingdan() {
				Connection conn = null;
				PreparedStatement stmt = null;
				ResultSet rs = null;
				ArrayList<Dingdan> list = new ArrayList<Dingdan>(); // 商品集合
				try {
					conn = DbUtil.getConnection();
					String sql = "select * from Dingdan;"; // SQL语句
					stmt = conn.prepareStatement(sql);
					rs = stmt.executeQuery();
					while (rs.next()) {
						Dingdan dingdan=new Dingdan();
						dingdan.setId(rs.getInt("id"));
						dingdan.setUsername(rs.getString("username"));
						dingdan.setName(rs.getString("name"));
						dingdan.setShr(rs.getString("shr"));
						dingdan.setAddress(rs.getString("address"));
						dingdan.setTel(rs.getString("tel"));
						dingdan.setZt(rs.getString("zt"));
						list.add(dingdan);// 把一个商品加入集合
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
}
