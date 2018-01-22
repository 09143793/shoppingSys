package cn.edu.cumt.ec.dao;
//ÒµÎñÂß¼­Àà
import java.util.List;

import cn.edu.cumt.ec.entity.Dingdan;
import cn.edu.cumt.ec.entity.User;

public interface UserDao {
	public boolean add(User user);//×¢²á
	public boolean update(User oldUser,User newUser);
	public User findPassword(String tel);//ÕÒ»ØÃÜÂë
	public boolean delete(User user);
	public List<User> getAll();
	public User getByUsername(String username);
	public User getByTel(String tel);
	public boolean updatePassword(User user);
	public boolean loginDatabase(String username ,String password);//µÇÂ¼
	//ĞŞ¸ÄÃÜÂë
	public boolean alterPassword(String username,String oldpassword,String newpassword);

}
