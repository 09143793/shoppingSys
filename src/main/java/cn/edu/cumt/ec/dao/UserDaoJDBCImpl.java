package cn.edu.cumt.ec.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.User;
public class UserDaoJDBCImpl implements UserDao {
	//×¢²á
		@Override
		public boolean add(User user) {
		
			return DbUtil.executeUpdate("insert into user values(?,?,?)",new Object[]{user.getUsername(),user.getTel(),user.getPassword()});		
		}

		@Override
		public boolean update(User oldUser,User newUser){
		
			return DbUtil.executeUpdate("update user set username=?,user_password=? where user_username=?",new Object[]{newUser.getUsername(),newUser.getTel(),oldUser.getUsername()});
		}

		@Override
		public boolean delete(User user) {
			
			return DbUtil.executeUpdate("delete from news_inf where news_id=?)",new Object[]{user.getUsername()});
		}
		@Override
		public List<User> getAll() {
		
			ResultSet rs=DbUtil.executeQuery("select * from user", new Object[]{});
			List<User> newsList=new ArrayList<User>();
			try{
				while(rs.next()){
					User user=new User();
					user.setUsername(rs.getString(1));
					user.setTel(rs.getString(2));
					user.setPassword(rs.getString(3));
					newsList.add(user);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			return newsList;
		}

		@Override
		public User getByUsername(String Username) {
		
			ResultSet rs=DbUtil.executeQuery("select * from user where username=?", new Object[]{Username});
			User user=null;
			try{
				while(rs.next()){
					user=new User();
					user.setUsername(rs.getString(1));
					user.setPassword(rs.getString(3));
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			return user;
		}

		@Override
		public User getByTel(String tel) {
			
			return null;
		}

		@Override
		public boolean updatePassword(User user) {
			
			return false;
		}
		@Override
		//ÕÒ»ØÃÜÂë 
		public User findPassword (String tel){
			ResultSet rs=DbUtil.executeQuery("select username,password from user where tel=?", 
					new Object[]{tel});
			User a=null;
			try{
				while(rs.next()){
					a=new User();
					a.setUsername(rs.getString(1));
					a.setPassword(rs.getString(2));
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			{
				return a;
			}	
		}
		@Override
	//µÇÂ¼
		public boolean loginDatabase (String username,String password){
			ResultSet rs=DbUtil.executeQuery("select * from user where username=? and password=?", 
					new Object[]{username,password});
			User user=null;
			try{
				while(rs.next()){
					user=new User();
					user.setUsername(rs.getString(1));
					user.setPassword(rs.getString(3));
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			if (user!=null){
				return true;
			}
			else{
				return false;
			}
		}
		@Override
		//ÐÞ¸ÄÃÜÂë	
		public boolean alterPassword(String username,String oldpassword,String newpassword){
			ResultSet rs=DbUtil.executeQuery("select * from user where username=? ", 
					new Object[]{username});
			User user=null;
			try{
			while(rs.next()){
				user=new User();
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(3));
				user.setTel(rs.getString(2));
			}
			}catch(SQLException e){
				e.printStackTrace();
			}
				
			boolean udpsw=DbUtil.executeUpdate("update user set password=?"+ "where username=?",
					new Object[]{newpassword,user.getUsername()});	
			if (udpsw==true){
				return true;
			}
			else{
				return false;
			
			}	
			}
}

		
		
