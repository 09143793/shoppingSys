package cn.edu.cumt.ec.action;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.edu.cumt.ec.dao.WishDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Wish;
import cn.edu.cumt.ec.service.WishService;

public class wishTest {

	@Test
	public void execute() throws Exception{
		WishDaoJDBCImpl wishdaojdbcimpl=new WishDaoJDBCImpl();
		WishService wishService=new WishService();
		wishService.setWishDao(wishdaojdbcimpl);
		Wish wish=new Wish();
	    wish.setWishId(1);
	    wish.setName("1");
	    wish.setPrice("1");
	    wish.getImage();
	    boolean b1=wishService.add(wish);
	     System.out.println("error");		
	}

}
