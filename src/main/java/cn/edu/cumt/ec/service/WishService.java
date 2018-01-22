package cn.edu.cumt.ec.service;

import java.util.List;
import cn.edu.cumt.ec.dao.WishDao;
import cn.edu.cumt.ec.dao.WishDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Wish;

public class WishService {
	public WishService() {
		super();
	}
	private WishDao wishDao;

	public void setWishDao(WishDao wishDao) {
		this.wishDao = wishDao;
	}
	public WishService(WishDao wishDao ){
		this.wishDao = wishDao;
	}
	//Ìí¼Ó
		public  boolean add(Wish wish){
			return wishDao.add(wish);
		}

}
