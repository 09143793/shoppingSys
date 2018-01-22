package cn.edu.cumt.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Dingdan;
import cn.edu.cumt.ec.entity.Items;

public class DingdanDaoJDBCImpl implements DingdanDao {
	//ע�� {
	//ע��
			@Override
			public boolean add(Dingdan dingdan) {
			
				return DbUtil.executeUpdate("insert into dingdan values(?,?,?,?,?,?,?)",new Object[]{dingdan.getId(),dingdan.getUsername(),dingdan.getName(),dingdan.getShr(),dingdan.getAddress(),dingdan.getTel(),dingdan.getZt()});		
			}

			@Override
			// ������е���Ʒ��Ϣ
			public ArrayList<Dingdan> getAllDingdan() {
				Connection conn = null;
				PreparedStatement stmt = null;
				ResultSet rs = null;
				ArrayList<Dingdan> list = new ArrayList<Dingdan>(); // ��Ʒ����
				try {
					conn = DbUtil.getConnection();
					String sql = "select * from Dingdan;"; // SQL���
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
						list.add(dingdan);// ��һ����Ʒ���뼯��
					}
					return list; // ���ؼ��ϡ�
				} catch (Exception ex) {
					ex.printStackTrace();
					return null;
				} finally {
					// �ͷ����ݼ�����
					if (rs != null) {
						try {
							rs.close();
							rs = null;
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
					// �ͷ�������
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
