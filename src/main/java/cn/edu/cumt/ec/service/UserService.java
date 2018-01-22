package cn.edu.cumt.ec.service;

import java.util.List;
import cn.edu.cumt.ec.dao.UserDao;
import cn.edu.cumt.ec.entity.User;
public class UserService {
	public UserService() {
		super();
	}
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public UserService(UserDao userDao ){
		this.userDao = userDao;
	}
	//×¢²á
	public boolean add(User user){
		return userDao.add(user);
	}
	public boolean update(User oldUSer,User newUser){
		return userDao.update(oldUSer,newUser);
	}
	public boolean delete(User user){
		return userDao.delete(user);
	}
	public List<User> getAll(){
		return userDao.getAll();
	}
	public User getByUsername(String username, String password){
		return userDao.getByUsername(username);
	}
	
	public boolean updatePassword(User user){
		return userDao.updatePassword(user);
	}
	
	
	public User getByUsername1(String username){
		return userDao.getByUsername(username);
	}
	public User getByTel(String tel){
		return userDao.getByTel(tel);
	}
	//µÇÂ¼
	public boolean loginDatabase(String username,String password) {
		return userDao.loginDatabase(username,password);
	}
	//ÕÒ»ØÃÜÂë
	public User findPassword(String tel){
		return userDao.findPassword(tel);
	}
	//ĞŞ¸ÄÃÜÂë
	public boolean alterPassword(String username,String oldpassword,String newpassword){
		return userDao.alterPassword(username, oldpassword, newpassword);
	}
	
	}
