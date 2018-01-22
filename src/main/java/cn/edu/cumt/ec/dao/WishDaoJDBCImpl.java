package cn.edu.cumt.ec.dao;



import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Wish;

public class WishDaoJDBCImpl implements WishDao{
	
	//º”»Î
public boolean add(Wish wish) {
	
			
return DbUtil.executeUpdate("insert into wish values(?,?,?,?)",new Object[]{wish.getWishId(),wish.getName(),wish.getPrice(),wish.getImage()});		
			}

}
